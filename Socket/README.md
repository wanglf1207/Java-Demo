# Socket编程基本示例

本次测试是用两台电脑测试的，Ubuntu启动server端，mac启动客户端

## 新建一个socket服务端程序

```java
package com.demo.socket.tcp.v1;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

    public static void main(String[] args) throws  Exception {
        // 指定监听的端口
        int port = 55533;
        // 创建一个serverSocket
        ServerSocket serverSocket = new ServerSocket(port);

        System.out.println("server等待连接的到来....");

        // 阻塞点，深入一点这里是从操作系统的队列里取数据
        Socket socket = serverSocket.accept();

        // 建立好连接后，从socket中获取输入流，并建立缓冲区进行读取
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];

        int length;
        StringBuilder stringBuilder = new StringBuilder();
        // 只有当客户端关闭他的输出流的时候，服务端才能取得到结尾的-1
        // 此处的read也是一个阻塞方法
        while ((length=inputStream.read(bytes)) != -1) {
            stringBuilder.append(new String(bytes,0,length,"UTF-8"));
        }

        System.out.println("the message received from client is : " + stringBuilder);

        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
```



## 再新建一个socket客户端程序

```java
package com.demo.socket.tcp.v1;

import java.io.OutputStream;
import java.net.Socket;

public class SocketClient {
    public static void main(String[] args) throws Exception {
        String serverIp = "192.168.11.116";
        int serverPort = 55533;

        //与服务器建立连接
        Socket socket = new Socket(serverIp,serverPort);

        // 建立连接后获得输出流
        OutputStream outputStream = socket.getOutputStream();
        String message = "hello bill,你一定要把工作做好！";
        socket.getOutputStream().write(message.getBytes());
        outputStream.close();
        socket.close();
    }
}
```



客户端通过ip和端口，连接到指定的server，然后通过Socket获得输出流，并向其输出内容，服务器会获得消息。最终服务端控制台打印如下：



```tex
server等待连接的到来....
the message received from client is : hello bill,你一定要把工作做好！
Process finished with exit code 0
```



单线程情况下只能有一个客户端，用线程池可以有多个客户端连接，但是非常消耗性能。

# 发送消息并接受消息

在“基本示例”中，客户端向服务端发送了消息，服务器成功接收到了消息，并打印到了控制台上，但是客户端并没用收到服务器返回的消息，现在我们想在客户端看到服务端返回的消息怎么办？



## 服务器端程序



```java
package com.demo.socket.tcp.v2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) throws  Exception {
        // 指定监听的端口
        int port = 55533;

        ServerSocket serverSocket = new ServerSocket(port);

        System.out.println("server等待连接的到来....");
        Socket socket = serverSocket.accept();

        // 建立好连接后，从socket中获取输入流，并建立缓冲区进行读取
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        StringBuilder sb = new StringBuilder();
        // 只有当客户端关闭他的输出流的时候，服务端才能取得到结尾的-1
        while ((len=inputStream.read(bytes)) != -1) {
            //
            sb.append(new String(bytes,0,len,"UTF-8"));
        }

        System.out.println("the message received from client is : " + sb);

        // 创建输出流,
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello client, I have received the message".getBytes("UTF-8"));

        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();
    }
}

```

 相对于“基础示例”中，服务端程序在接收到消息之后，创建了用一个输出流，向输出流中写入数据：

```java
 OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello client, I have received the message".getBytes("UTF-8"));
```





## 客户端程序



```java
package com.demo.socket.tcp.v2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketClient {
    public static void main(String[] args) throws Exception {
        String serverIp = "192.168.11.116";
        int serverPort = 55533;

        //与服务器建立连接
        Socket socket = new Socket(serverIp,serverPort);

        // 建立连接后获得输出流
        OutputStream outputStream = socket.getOutputStream();
        String message = "hello bill,你一定要把工作做好！";
        socket.getOutputStream().write(message.getBytes("UTF-8"));

        // 通过shutdownOutput告诉服务器已经发送完数据，后续只能接收数据
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        StringBuilder stringBuilder = new StringBuilder();
        while ((len=inputStream.read(bytes)) != -1) {
            // 指定编码格式，发送方和接收方一定要统一，建议使用UTF-8
            stringBuilder.append(new String(bytes,0,len,"UTF-8"));
        }
        System.out.println("the message received from server is : " + stringBuilder);

        inputStream.close();
        outputStream.close();
        socket.close();
    }
}

```

和“基础示例”相比，客户端发生了比较大的变化，其中

```java
        socket.shutdownOutput();
```

关闭了输出流，告诉服务器已经发送完数据，后续只能接收数据。接着创建了输入流并从输入流中读取数据。



```java
      InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        StringBuilder stringBuilder = new StringBuilder();
        while ((len=inputStream.read(bytes)) != -1) {
            // 指定编码格式，发送方和接收方一定要统一，建议使用UTF-8
            stringBuilder.append(new String(bytes,0,len,"UTF-8"));
        }
        System.out.println("the message received from server is : " + stringBuilder);
```



这个模式的使用场景一般用在，客户端发送命令给服务器，然后服务器相应指定的命令，如果只是客户端发送消息给服务器，然后让服务器返回收到消息的消息，这就有点过分了，这就是完全不相信Socket的传输安全性，要知道它的底层可是TCP，如果没有发送到服务器端是会抛异常的，这点完全不用担心。



# 如何通知对方已经发送完数据

其实这个问题还是比较重要的，正常来说，客户端打开一个输出流，如果不做约定，也不关闭它，那么服务端永远不知道客户端是否发送完消息，那么服务端会一直等待下去，直到读取超时。所以怎么告知服务端已经发送完消息就显得特别重要。



## 通过socket关闭通知服务端

我们在“基本示例”中使用过该方式，也就是在发送数据结束后执行

```java
socket.close();
```

当Socket关闭的时候，服务端就会收到响应的关闭信号，那么服务端也就知道流已经关闭了，这个时候读取操作完成，就可以继续后续工作。

但是这种方式有一些缺点：

- 客户端Socket关闭后，将不能接受服务端发送的消息，也不能再次发送消息

- 如果客户端想再次发送消息，需要重现创建Socket连接

## 通过Socket关闭输出流的方式

这种方式调用的方法是：

```java
socket.shutdownOutput();
```



而不是（outputStream为发送消息到服务端打开的输出流）：

```java
outputStream.close();
```



如果关闭了输出流，那么相应的Socket也将关闭，和直接关闭Socket一个性质。

调用Socket的shutdownOutput()方法，底层会告知服务端我这边已经写完了，那么服务端收到消息后，就能知道已经读取完消息，如果服务端有要返回给客户的消息那么就可以通过服务端的输出流发送给客户端，如果没有，直接关闭Socket。

这种方式通过关闭客户端的输出流，告知服务端已经写完了，虽然可以读到服务端发送的消息，但是还是有一点点缺点：

不能再次发送消息给服务端，如果再次发送，需要重新建立Socket连接。

这个缺点，在访问频率比较高的情况下将是一个需要优化的地方。


## 通过约定符号

这种方式的用法，就是双方约定一个字符或者一个短语，来当做消息发送完成的标识，通常这么做就需要改造读取方法。

假如约定单端的一行为end，代表发送完成，例如下面的消息，end则代表消息发送完成：

```tex
hello yiwangzhibujian
end
```



可以看见，服务端不仅判断是否读到了流的末尾，还判断了是否读到了约定的末尾。

这么做的优缺点如下：

优点：不需要关闭流，当发送完一条命令（消息）后可以再次发送新的命令（消息）

缺点：需要额外的约定结束标志，太简单的容易出现在要发送的消息中，误被结束，太复杂的不好处理，还占带宽。

经过了这么多的优化还是有缺点，难道就没有完美的解决方案吗，答案是有的，看接下来的内容。


这段代码我没用调好，有空调整-20210313



# 通过指定长度

如果你了解一点class文件的结构（后续会写，敬请期待），那么你就会佩服这么设计方式，也就是说我们可以在此找灵感，**就是我们可以先指定后续消息的长度，然后读取指定长度的内容做为客户端发送的消息。**

现在首要的问题就是用几个字节表示长度呢，我们可以算一算：

1个字节：最大256，表示256B
2个字节：最大65536，表示64K
3个字节：最大16777216，表示16M
4个字节：最大4294967296，表示4G
依次类推

注释：一个字节是8个二进制位。一个字节最大就是11111111（8个1），从右到左依次是

```tex
1*2^0,  1*2^1, ... 1*2^7
```

换算成十进制就是

```tex
1+2+...+127 = 256
```



我们继续，这个时候是不是很纠结，最大的当然是最保险的，但是真的有必要选择最大的吗，其实如果你稍微了解一点UTF-8的编码方式（字符编码后续会写，敬请期待），那么你就应该能想到为什么一定要固定表示长度字节的长度呢，我们可以使用变长方式来表示长度的表示，比如：

 第一个字节首位为0：即0XXXXXXX，表示长度就一个字节，最大128，表示128B
第一个字节首位为110，那么附带后面一个字节表示长度：即110XXXXX 10XXXXXX，最大2048，表示2K
第一个字节首位为1110，那么附带后面二个字节表示长度：即110XXXXX 10XXXXXX 10XXXXXX，最大131072，表示128K
依次类推

上面提到的这种用法适合高富帅的程序员使用，一般呢，如果用作命名发送，两个字节就够了，如果还不放心4个字节基本就能满足你的所有要求，下面的例子我们将采用2个字节表示长度，目的只是给你一种思路，让你知道有这种方式来获取消息的结尾。

ssss
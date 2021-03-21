NIO特点

ServerSocketChannel 对应BIO中的ServerSocket
SocketChannel 对应BIO中的Socket
Selector是NIO核心的部分，附件监听ServerSocketChannel和SocketChannel
线程通过拥有一个selector就可以位多个客人去服务

NIO是netty的基础，不懂NIO是看不懂netty源码的，所以要先学习NIO

# 服务端程序：



```java
package com.bill.demo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * NIO服务端
 * @author 小路
 */
public class NIOServer {
    //通道管理器
    private Selector selector;

    /**
     * 获得一个ServerSocket通道，并对该通道做一些初始化的工作
     * @param port  绑定的端口号
     * @throws IOException
     */
    public void initServer(int port) throws IOException {
        // 获得一个ServerSocket通道
        ServerSocketChannel serverChannel = ServerSocketChannel.open();
        // 设置通道为非阻塞
        serverChannel.configureBlocking(false);
        // 将该通道对应的ServerSocket绑定到port端口
        serverChannel.socket().bind(new InetSocketAddress(port));
        // 获得一个通道管理器
        this.selector = Selector.open();
        //将通道管理器和该通道绑定，并为该通道注册SelectionKey.OP_ACCEPT事件,注册该事件后，
        //当该事件到达时，selector.select()会返回，如果该事件没到达selector.select()会一直阻塞（也可以不阻塞）。
        serverChannel.register(selector, SelectionKey.OP_ACCEPT);
    }

    /**
     * 采用轮询的方式监听selector上是否有需要处理的事件，如果有，则进行处理
     * @throws IOException
     */
    @SuppressWarnings("unchecked")
    public void listen() throws IOException {
        System.out.println("服务端启动成功！");
        // 轮询访问selector
        while (true) {
            //当注册的事件到达时，方法返回；否则,该方法会一直阻塞
            // 判断一个IO是不是阻塞，关注的点是读取数据的时候能不能立马返回
            selector.select();

            // 可以写成不阻塞,1000毫秒就返回 selector.wakeup(),也可以唤醒
            // 可以说整个过程都没用阻塞
            //selector.select(1000);
            // 获得selector中选中的项的迭代器，选中的项为注册的事件
            Iterator ite = this.selector.selectedKeys().iterator();
            while (ite.hasNext()) {
                SelectionKey key = (SelectionKey) ite.next();
                // 删除已选的key,以防重复处理
                ite.remove();
                // 客户端请求连接事件
                if (key.isAcceptable()) {
                    ServerSocketChannel server = (ServerSocketChannel) key
                            .channel();
                    // 获得和客户端连接的通道
                    SocketChannel channel = server.accept();
                    // 设置成非阻塞
                    channel.configureBlocking(false);

                    //在这里可以给客户端发送信息哦
                    channel.write(ByteBuffer.wrap(new String("向客户端发送了一条信息").getBytes()));
                    //在和客户端连接成功之后，为了可以接收到客户端的信息，需要给通道设置读的权限。
                    channel.register(this.selector, SelectionKey.OP_READ);

                    // 获得了可读的事件
                } else if (key.isReadable()) {
                    read(key);
                }

            }

        }
    }
    /**
     * 处理读取客户端发来的信息 的事件
     * @param key
     * @throws IOException
     */
    public void read(SelectionKey key) throws IOException{
        // 服务器可读取消息:得到事件发生的Socket通道
        SocketChannel channel = (SocketChannel) key.channel();
        // 创建读取的缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(10);
        int read = channel.read(buffer);
        if(read>0) {
            byte[] data = buffer.array();
            String msg = new String(data).trim();
            System.out.println("服务端收到信息："+msg);
            ByteBuffer outBuffer = ByteBuffer.wrap(msg.getBytes());
            channel.write(outBuffer);// 将消息回送给客户端
        } else  {
            System.out.println("服务器已经关闭");
            key.cancel();
        }


    }

    /**
     * 启动服务端测试
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        NIOServer server = new NIOServer();
        server.initServer(8000);
        server.listen();
    }

}

```

# 客户端程序

```java
package com.bill.demo;
 
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
 
/**
 * NIO客户端
 * @author 小路
 */
public class NIOClient {
	//通道管理器
	private Selector selector;
 
	/**
	 * 获得一个Socket通道，并对该通道做一些初始化的工作
	 * @param ip 连接的服务器的ip
	 * @param port  连接的服务器的端口号         
	 * @throws IOException
	 */
	public void initClient(String ip,int port) throws IOException {
		// 获得一个Socket通道
		SocketChannel channel = SocketChannel.open();
		// 设置通道为非阻塞
		channel.configureBlocking(false);
		// 获得一个通道管理器
		this.selector = Selector.open();
		
		// 客户端连接服务器,其实方法执行并没有实现连接，需要在listen（）方法中调
		//用channel.finishConnect();才能完成连接
		channel.connect(new InetSocketAddress(ip,port));
		//将通道管理器和该通道绑定，并为该通道注册SelectionKey.OP_CONNECT事件。
		channel.register(selector, SelectionKey.OP_CONNECT);
	}
 
	/**
	 * 采用轮询的方式监听selector上是否有需要处理的事件，如果有，则进行处理
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public void listen() throws IOException {
		// 轮询访问selector
		while (true) {
			selector.select();
			// 获得selector中选中的项的迭代器
			Iterator ite = this.selector.selectedKeys().iterator();
			while (ite.hasNext()) {
				SelectionKey key = (SelectionKey) ite.next();
				// 删除已选的key,以防重复处理
				ite.remove();
				// 连接事件发生
				if (key.isConnectable()) {
					SocketChannel channel = (SocketChannel) key
							.channel();
					// 如果正在连接，则完成连接
					if(channel.isConnectionPending()){
						channel.finishConnect();
						
					}
					// 设置成非阻塞
					channel.configureBlocking(false);
 
					//在这里可以给服务端发送信息哦
					channel.write(ByteBuffer.wrap(new String("向服务端发送了一条信息").getBytes()));
					//在和服务端连接成功之后，为了可以接收到服务端的信息，需要给通道设置读的权限。
					channel.register(this.selector, SelectionKey.OP_READ);
					
					// 获得了可读的事件
				} else if (key.isReadable()) {
						read(key);
				}
 
			}
 
		}
	}
	/**
	 * 处理读取服务端发来的信息 的事件
	 * @param key
	 * @throws IOException 
	 */
	public void read(SelectionKey key) throws IOException{
		//和服务端的read方法一样
	}
	
	
	/**
	 * 启动客户端测试
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		NIOClient client = new NIOClient();
		client.initClient("localhost",8000);
		client.listen();
	}
 
}
```



# telnet命令测试

也可以直接用telnet测试，不用写java客户端程序。





1、客户端关闭的时候会抛出异常，死循环，解决方案：

```java
int read = channel.read(buffer);
        if(read>0) {
            byte[] data = buffer.array();
            String msg = new String(data).trim();
            System.out.println("服务端收到信息："+msg);
            ByteBuffer outBuffer = ByteBuffer.wrap(msg.getBytes());
            channel.write(outBuffer);// 将消息回送给客户端
        } else  {
            System.out.println("服务器已经关闭");
            key.cancel();
        }
```

2、selector.select()阻塞，为什么说nio是非阻塞？

selector.select();//阻塞

selector.select(1000);// 非阻塞

selector.wakeup(),可以唤醒selector



3、selectionKey.OP_WRITE是代表声明意思？

OP_WRITE表示底层缓冲区是否有空间，是则相应返回true
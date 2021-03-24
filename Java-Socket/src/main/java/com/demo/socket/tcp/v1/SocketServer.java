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
        // 只有当客户端关闭他的输出流的时候，服务端才能取得到结尾的-1
        // 此处的read也是一个阻塞方法
        while (true) {
            // 将读取都的数据存储到bytes数组中
            int read = inputStream.read(bytes);
            if(read != -1) {
                System.out.println(new String(bytes,0,read));
            } else {
                break;
            }
        }
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}

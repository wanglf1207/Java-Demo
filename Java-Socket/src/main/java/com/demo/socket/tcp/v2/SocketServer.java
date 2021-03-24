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

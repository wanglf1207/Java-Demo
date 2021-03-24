package com.demo.socket.tcp.v3;

import java.io.*;
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
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(socket.getInputStream(),"UTF-8"));

        String line;
        StringBuilder sb = new StringBuilder();
        System.out.println(bufferedReader.readLine());
        // 如果读到的行内容是end就不继续append
        while ((line=bufferedReader.readLine()) != null) {
            sb.append(line);
            System.out.println("the message received from client is : " + sb);

        }


        // 创建输出流,
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello client, I have received the message".getBytes("UTF-8"));

        // 不关闭流了
       /* bufferedReader.close();
        outputStream.close();
        socket.close();
        serverSocket.close();*/
    }
}

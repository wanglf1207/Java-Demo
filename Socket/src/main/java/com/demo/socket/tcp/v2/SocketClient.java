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

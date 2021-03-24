package com.demo.socket.tcp.v5;

import java.io.OutputStream;
import java.net.Socket;

public class SocketClient {
    public static void main(String args[]) throws Exception {
        String serverIp = "127.0.0.1";
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
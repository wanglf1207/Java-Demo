package com.demo.socket.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 接收客户端发送的字符串，然后返回给客户端
 * 弊端：收到消息后必须返回消息，否则整个程序阻塞，因为是单线程
 */
public class TalkServer {
	
	public static void main(String args[]) throws IOException {

        ServerSocket serverSocket = new ServerSocket(4700);
        Socket socket = serverSocket.accept();

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());

        System.out.println("received message ： " + bufferedReader.readLine());
        // 接收键盘输入
        String line = GetKeyboardInput.getInputString();
        while (!line.equalsIgnoreCase("bye")) {
            printWriter.println(line);
            printWriter.flush();
            System.out.println("Server response msg : " + line );
            System.out.println("Server received msg: " + bufferedReader.readLine());
            line = GetKeyboardInput.getInputString();
        }

        bufferedReader.close();
        printWriter.close();
        socket.close();
        serverSocket.close();
	}
}
			
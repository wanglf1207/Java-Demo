package com.demo.socket.tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws InterruptedException {

		try {
			ServerSocket serverSocket = new ServerSocket(6666);
			Socket socket = serverSocket.accept();
			InputStream inputStream = socket.getInputStream();
			DataInputStream dis = new DataInputStream(inputStream);
			byte[] bytes = new byte[6000];
			int j = 0;
			
			while(true) {
				int i = dis.available();			
				if (i <= 0){
					dis.close();
					socket.close();
					break;
				} 
				byte b = dis.readByte();
				bytes[j] = b;
				j++;
			}
			serverSocket.close();
		 System.out.println(new String(bytes).trim());
		 
		 Socket sendSocket = new Socket("182.57.16.106",35190);
		 OutputStream os = sendSocket.getOutputStream();
		 os.write(bytes);
		 os.flush();
		 socket.close();
		 sendSocket.close();
		 Thread.sleep(1000);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
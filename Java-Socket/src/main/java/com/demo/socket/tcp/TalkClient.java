package com.demo.socket.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 */
public class TalkClient {
	
	public static void main(String args[]) throws IOException {
		
		String ipAddress = "127.0.0.1";
		int port = 4700;

		Socket socket = new Socket(ipAddress,port);
		PrintWriter os = new PrintWriter(socket.getOutputStream());

		BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		String readline = GetKeyboardInput.getInputString();

		while (!readline.equals("bye"))	{
			os.println(readline);
			os.flush();
			System.out.println("send message : " + readline);
			System.out.println("receive message : " + is.readLine());
			readline = GetKeyboardInput.getInputString();
		}

		os.close();
		is.close();
		socket.close();
	}
}
			
package com.demo.socket.tcp;

import java.io.*;
import java.net.*;

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
			
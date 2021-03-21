package com.demo.socket.udp;

import java.net.*;

public class UDPServer {
	
	private static DatagramPacket datagramPacket;
	private static DatagramSocket datagramSocket;
	
	public static void main(String args[]) throws Exception
	{
		byte buf[] = new byte[1024];
		datagramPacket = new DatagramPacket(buf, buf.length);
		datagramSocket = new DatagramSocket(5678);
		
		while(true) {
			datagramSocket.receive(datagramPacket);
			System.out.println(new String(buf,0,datagramPacket.getLength()));
		}
	}
}
package com.demo.socket.udp;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class TestUDPServer {
	
	private static DatagramSocket datagramSocket;
	private static DatagramPacket datagramPacket;

	public static void main(String args[]) throws Exception {
		
		byte buf[] = new byte[1024];
		
		datagramPacket = new DatagramPacket(buf, buf.length);
		datagramSocket = new DatagramSocket(7777);
		
		while(true) {
			
			datagramSocket.receive(datagramPacket);//����ʽ�ķ���
			//getLength������������ܹ����˶�������
			//System.out.println(new String(buf,0,dp.getLength()));
			ByteArrayInputStream bais = new ByteArrayInputStream(buf);
			DataInputStream dis = new DataInputStream(bais);
			System.out.println(dis.readLong());
			
		}
	}
}
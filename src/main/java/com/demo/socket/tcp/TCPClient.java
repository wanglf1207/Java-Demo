package com.demo.socket.tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author wanglf
 * Client��ʹ�õĶ˿���ϵͳ���ѡ���
 */
public class TCPClient {
	
	public static void main(String[] args) {
		
		try {
			Socket s = new Socket("127.0.0.1",6666);
			OutputStream os = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			// ��������޹ط�ʽʹ�� UTF-8 �޸İ���뽫һ���ַ���д������������
			dos.writeUTF("hello server!");
			dos.flush();
			dos.close();
			s.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package com.demo.socket.inetaddr;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress inetAddress = InetAddress.getLocalHost(); //��ñ���IP��ַ���
		System.out.println(InetAddress.getLocalHost());
		System.out.println(inetAddress.getHostAddress());
		
		InetAddress ia2 = InetAddress.getByName("wanglf"); //ͨ�������������Ϣ
		System.out.println(ia2.getHostAddress());
		
		InetAddress ia4=InetAddress.getByName("baidu.com"); //����������DNS��ѯIp
		System.out.println("baidu ip:"+ia4.getHostAddress());
		
		InetAddress ia3 = InetAddress.getByAddress(new byte[]{(byte)192,(byte)168,38,1}); //ͨ������IP�����Ϣ
		System.out.println(ia3.getHostName());
	}
	
}

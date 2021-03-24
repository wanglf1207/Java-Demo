package com.demo.socket.url;

import java.io.IOException;
import java.net.URL;

public class URLTest {

	public static void main(String[] args) throws IOException {
		
		URL u = new URL("http://www.baidu.com");
		
		// ��ȡ��URL����Ȩ����
		System.out.println(u.getAuthority());
		
		// �˿ںţ����δ���ö˿ںţ��򷵻� -1
		System.out.println(u.getPort());
		
		// ��ȡ��URL������Э��
		System.out.println(u.getProtocol());
		
		// ��ȡ�� URL ��������
		System.out.println(u.getHost());
		
		// ��ȡ�� URL ��ê�㣨Ҳ��Ϊ�����á���
		System.out.println(u.getRef());
		
		System.out.println(u.openConnection());
	}

}

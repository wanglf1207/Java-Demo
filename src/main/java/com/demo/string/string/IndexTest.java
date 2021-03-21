package com.demo.string.string;

public class IndexTest {

	public static void main(String[] args) {
		
		String str = "abcdefghigklabcdefghigkl";
		
		System.out.println(str.indexOf("i")); // �ַ�������i����8,��0��ʼ��
		System.out.println(str.indexOf("m")); // �ַ�����û��m���� -1
		System.out.println(str.indexOf("a")); // �ַ������ж��a���ص�һ��a����λ�� 0
		
	}
}

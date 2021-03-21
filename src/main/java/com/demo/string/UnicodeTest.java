package com.demo.string;

public class UnicodeTest {
	
	public static void main(String[] args) {
		String test = "����";
		String unicode = stringToUnicode(test);
		System.out.println(unicode);
		String string = unicodeToString(unicode);
		System.out.println(string);
	}

	// �ַ���ת��unicode
	public static String stringToUnicode(String string) {
		StringBuffer unicode = new StringBuffer();
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i); // ȡ��ÿһ���ַ�
			unicode.append("\\u" + Integer.toHexString(c));// ת��Ϊunicode
		}
		return unicode.toString();
	}

	// unicode ת�ַ���
	public static String unicodeToString(String unicode) {
		StringBuffer string = new StringBuffer();
		String[] hex = unicode.split("\\\\u");
		for (int i = 1; i < hex.length; i++) {
			int data = Integer.parseInt(hex[i], 16);// ת����ÿһ�������
			string.append((char) data);// ׷�ӳ�string
		}
		return string.toString();
	}
}
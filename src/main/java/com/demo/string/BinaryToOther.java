package com.demo.string;

import java.math.BigInteger;

/**
 * ����������������ת�����������Ƶ�����
 * @author wanglf1207
 *
 */
public class BinaryToOther {

	public BinaryToOther() {
		
	}

	/*
	 * ��byte[]תΪ���ֽ��Ƶ��ַ�����ʾ
	 * 
	 * @param bytes byte[]
	 * @param radix
	 * ��������ת�����Ƶķ�Χ����Character.MIN_RADIX��Character.MAX_RADIX��������Χ���Ϊ10����
	 * @return ת������ַ���
	 * �����1��������
	 */
	public static String binary(byte[] bytes, int radix) {
		
		return new BigInteger(1, bytes).toString(radix);
	}
	
	
	public static void main(String [] args) {
		// 1��110001
		// 2: 110010
		// 12�� 11000100110010
		String str = "2";
		byte[] bytes = str.getBytes();  
		System.out.println("��woainiתΪ��ͬ���Ƶ��ַ�����");  
		System.out.println("����ת���Ľ��Ʒ�Χ��" + Character.MIN_RADIX + "-" + Character.MAX_RADIX);  
		System.out.println("2���ƣ�"   + binary(bytes, 2));  
		/*System.out.println("5���ƣ�"   + binary(bytes, 5));  
		System.out.println("8���ƣ�"   + binary(bytes, 8));  
		System.out.println("16���ƣ�"  + binary(bytes, 16));  
		System.out.println("32���ƣ�"  + binary(bytes, 32));  
		System.out.println("64���ƣ�"  + binary(bytes, 64));// ����Ѿ�������Χ��������Χ���Ϊ10������ʾ  
		 */		 
		// System.exit(0);  

	}

}

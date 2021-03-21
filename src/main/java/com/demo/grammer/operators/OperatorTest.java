package com.demo.grammer.operators;

public class OperatorTest {
	
	public static void test() {
		int i = 5,j=5;
		System.out.print(i++);
		System.out.print(i);
		System.out.println(++i);
		
		System.out.print(j--);
		System.out.print(j);;
		System.out.println(--j);;
		
	}
	
	/**
	 * ��λ�루&������
	 */
	public static void test1() {
		int a = 10;
		int b = 11;
		// ��ת��Ϊ�����ƿ���
		System.out.println(Integer.toBinaryString(a) + " " + Integer.toBinaryString(b));
		// outputs:1010 1011
		// Java�а�δ��&�������Ϊ���߶���1����Ϊ1��a��b��λ��&������֮���Ӧ������Ϊ1010,����10��
		//��֤�£�
		int c = a & b;
		System.out.println("a & b ��" + c);
		// outputs ��a & b ��10 ����������ƥ��
	}
	public static void main(String [] args) {
		test1();
	}
}

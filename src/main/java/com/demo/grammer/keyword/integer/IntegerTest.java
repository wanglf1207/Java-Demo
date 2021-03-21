package com.demo.grammer.keyword.integer;

/**
 * @author wanglf
 */
public class IntegerTest {
	
	static int temp = 1000;
	
	/*
	 * �Ƚ�int��Integer
	 */
	public static void intAndInteger() {
		int i1 = 1;
		Integer i2 = 1;
		Integer i3 = new Integer(1);
		System.out.println(i1==i2); // outputs true
		System.out.println(i2==i3); // outputs false
		System.out.println(i1==i3); // outputs true
	}
	
	/*
	 * �Զ�װ�书�ܣ�JDK1.5���ṩ
	 */
	public static void autoboxing() {
		
		/* �Զ�װ�书�� */
		Integer i = 100;
		System.out.println(i);
		
		/* ��ʵϵͳִ��������Ĵ���  */
		Integer i1 = Integer.valueOf(i);
		System.out.println(i1);
		 
		/* ���Կ϶������ */
		System.out.println(i==i1); //outputs true 
	}
	
	/*
	 * �Զ����书��
	 */
	public static void unboxing() {
		Integer i = 1;
		int i1 = i;
		System.out.println(i==i1);
	}
	
	/*
	 * equals() �Ƚϵ������������ֵ�����ݣ��Ƿ���ͬ��
	 * "==" �Ƚϵ���������������ã��ڴ��ַ���Ƿ���ͬ��Ҳ�����Ƚ����������������͵ı���ֵ�Ƿ���ȡ�
	 */
	public static void trueOrFalse() {
		
		/* i1��i2��������ͬ��Integer����û�д����Զ�װ�书�ܣ�������false*/
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		System.out.println(i1==i2); // outputs false
		
		/* ���ڨC128��127��Ĭ����127��֮���ֵ��Integer.valueOf(int i) ���ص��ǻ����Integer���󣨲������½�����
		 * ���Է����У�i3 �� i4ʵ������ָ��ͬһ������
		 * ������ֵ��ִ��Integer.valueOf(int i) ���ص���һ���½��� Integer�������Է����У�i5��i6 ָ����ǲ�ͬ�Ķ���
		 */
		Integer i3 = 1;
		Integer i4 = 1;
		System.out.println(i3==i4); // outputs true
		
		Integer i5 = 128;
		Integer i6 = 128;
		System.out.println(i5==i6); // outputs false
		
	}
	
	/*
	 * 
	 */
	public static void main(String [] args) {
		
		//intAndInteger();
		
		//autoboxing();
		
		trueOrFalse();
	}

}

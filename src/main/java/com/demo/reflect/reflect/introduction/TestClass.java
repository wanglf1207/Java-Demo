package com.demo.reflect.reflect.introduction;

/**
 * ���� forName("X") ����������Ϊ X ���౻��ʼ���� 
 * newInstance()������ Class ��������ʾ�����һ����ʵ����
 * ��ͬ��һ������һ���ղ����б�� new ���ʽʵ�������ࡣ���������δ��ʼ�������ʼ������ࡣ 
 */
public class TestClass {
	public static void main(String[] args) 
		throws ClassNotFoundException {
		String str = "abc";
		Class<? extends String> c1 = str.getClass();
		Class<? extends String> c2 = String.class;
		Class<? extends Object> c3 = Class.forName("java.lang.String");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c1.getName());
		System.out.println(c3.isPrimitive());//�Ƿ���ԭʼ����
		System.out.println(int.class);
		System.out.println(Integer.class);
		System.out.println(Integer.TYPE);
		System.out.println("System.class : "+System.class);
		System.out.println(byte[].class.getName());
		System.out.println(void.class);
		//��֮��ֻҪ��Դ�����г��ֵ����ͣ����ɸ��Ե�Class��������������磺int��void��Integer......
		System.out.println(int[].class.isArray());
		System.out.println(System.getProperty("java.home"));
	}
}

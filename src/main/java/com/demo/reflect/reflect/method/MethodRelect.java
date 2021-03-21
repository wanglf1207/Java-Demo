package com.demo.reflect.reflect.method;

import java.lang.reflect.Method;
/**
 * ��Ա�����ķ���
 * ���÷���ʵ�� str.charAt(1); 
 */
public class MethodRelect {
	public static void main(String[] args) throws Exception {
		String str = "abc";
		Method methodCharAt = String.class.getMethod("charAt", Integer.TYPE);
		System.out.println(methodCharAt.invoke(str, 1));
		//������JDK1.4��д�����������ã���֤���¼���
		System.out.println(methodCharAt.invoke(str, new Object[]{2}));
	}
}

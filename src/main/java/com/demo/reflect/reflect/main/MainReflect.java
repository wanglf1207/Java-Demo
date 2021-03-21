package com.demo.reflect.reflect.main;

import java.lang.reflect.Method;

//Ŀ�ģ�ʹ�÷��������һ�����е�main����
public class MainReflect {
	public static void main(String[] args) throws Exception {
		
		//��ͳ�ĵ��÷�ʽ������ִ��
		//Argument.main(new String[]{"1","2","3"});
		
		args [0] = "com.cn.reflect.main.Argument";
		String className = args[0];
		Method method = Class.forName(className).getMethod("main", String[].class);
		//����ע����飬��Ȼ�����﷨û�д�����JDK1.5����ַ���������Ϊ����������
		//����İ취����Object���͵������װ����
		//method.invoke(null, new String[]{"1","2","3"});
		//method.invoke(null, (Object)new String[]{"1","2","3"}); //����Ҳ��
		method.invoke(null, new Object[]{new String[]{"1","2","3"}});
	}
}

class Argument {
	public static void main(String[] args) {
		for(String arg:args) {
			System.out.println(arg);
		}
	}
} 

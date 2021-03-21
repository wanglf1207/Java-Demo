package com.demo.reflect.reflect.constructor;
/**
 * û�����������Ӱ��java�Ŀ���Ӧ�ã��ṩ�������ֻ���ṩ��һ������
 * ���� String str = (String)Class.forName(��java.lang.String��).newInstance();
 * �÷����ڲ��õ��õ�Ĭ�ϵĹ��췽����������������Ȼ���øù��췽������ʵ������
 * �÷������ڲ�ʵ���õ��˻������������Ĭ�Ϲ��췽����ʵ������
 */
public class NewInstance {
	public static void main(String[] args) {
		try {
			String str = (String) Class.forName("java.lang.String").newInstance();
			System.out.println(str.hashCode());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

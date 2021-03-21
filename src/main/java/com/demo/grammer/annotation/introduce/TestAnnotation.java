package com.demo.grammer.annotation.introduce;
//���ֻ�����ע��
public class TestAnnotation {
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// 报错了，随便该了一下
		System.runFinalization();
		sayHello();
	}
	@Deprecated
	public static void sayHello() {
		System.out.println("Hello!");
	}
}

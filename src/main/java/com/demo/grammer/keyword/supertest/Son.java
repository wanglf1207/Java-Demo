package com.demo.grammer.keyword.supertest;

class Father {
	public  void say() {
	}
}

public class Son extends Father {
	public  void say() {
		System.out.println(super.getClass().getName());
		//获取父类的类型
		System.out.println(super.getClass().getSuperclass().getName());
	}
	public static void main(String [] args) {
		new Son().say();
	}
}

package com.demo.grammer.keyword.finalmethod;

public class TestClass extends java.util.Date {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new TestClass().test();
	}

	public void test() {
		System.out.println(super.getClass());
	}
}

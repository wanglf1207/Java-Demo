package com.demo.grammer.keyword.supertest;

import java.util.Date;

public class Test extends Date {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		new Test().test();

	}
	
	public void test() {
		System.out.println( super.getClass().getName());
	}
}
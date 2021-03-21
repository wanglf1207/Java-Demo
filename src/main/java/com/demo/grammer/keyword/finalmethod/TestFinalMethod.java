package com.demo.grammer.keyword.finalmethod;

import java.util.Date;

class World extends Date{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6285137307981483328L;

	public  final void method() {
		System.out.println("fater");
		System.out.println(super.getClass());
	}
}
public class TestFinalMethod extends World {
	
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
       new TestFinalMethod().method();
       
	}

}

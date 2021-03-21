package com.demo.grammer.inherit.forextends.construtor;

class SuperClass {
	
	SuperClass() {
		System.out.println("SuperClass()");
	}
	
	SuperClass(int n){
		System.out.println("SuperClass(" + n +")");
	}
}

class SubClass extends SuperClass {
	
	 SubClass() {
		super(300);
		System.out.println("SubClass()");
	}
	 
	SubClass(int n) {
		System.out.println("SubClass(" + n + ")" );
	}

	
}

public class TestSuperSub {
	
	public static void main(String[] args) {
		
		new SubClass();
		new SubClass(400);
	}
}


package com.demo.grammer.polymorphic.v0;

class Animal {
	
	Animal() {
		System.out.println("Animal constructor...");
	}
}

class Cat extends Animal {
	
	Cat() {
		//super();
		System.out.println("Cat constructor...");
	}
}

public class T {
	public static void main(String[] args) {
		new Cat();
	}
}

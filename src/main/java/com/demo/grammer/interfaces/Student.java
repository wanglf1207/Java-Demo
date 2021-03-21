package com.demo.grammer.interfaces;

public class Student implements Singer{
	
	private String name;
	
	Student(String name) {
		this.name = name;
	}
	
	public void study() {
		System.out.println("studying");
	}
	
	public String getName() {
		return name;
	}
	
	public void sing() {
		System.out.println("student is singing");
	}
	public void sleep() {
		System.out.println("student is sleepping");
	}
}

package com.demo.grammer.keyword.superandthis;

public class Father {
	
	String name = "";
	
	Father() {
		System.out.println("this is Father constructor...");
	}
	
	Father(String name) {
		System.out.print("Father name is : " + name);
	}
	
	void value() {
		name = "Shanghai";
	}
	
	public static void prt(String str) {
		System.out.println(str);
	}
}

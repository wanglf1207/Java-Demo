package com.demo.string;

public class TestToStringValueOf {
	
	public static void main(String [] args) {
		
		String str = "123";
		int a = Integer.valueOf(str);
		System.out.println(a);
		
		
		String str1 = "abs";
		int b = Integer.valueOf(str1);
		System.out.println(b);
	    
		
		int c = 123;
		String str2 = String.valueOf(c);
		System.out.println(str2);
		
		Integer d = new Integer("123");
		String str3 = d.toString();
		System.out.println(str3);
		
		Integer e = new Integer("123");
		String str4 = String.valueOf(e);
		System.out.println(str4);
		
	}
}

package com.demo.string.string;

public class TestEquals {
	
	public static void main(String[] args) {
		
		char ch = '1';
		System.out.print('1'==ch);
		String str1 = "abc";
		String str2 = "abc";
		if (str1 == str2) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}
		
		if (str1.equals(str2)) {
			System.out.println("11");
		} else {
			System.out.println("22");
		}
		
		String str3 = new String("abcd");
		String str4 = new String("abcd");
		if (str3 == str4) {
			System.out.println("3");
		} else {
			System.out.println("4");
		}
		
		if (str3.equals(str4)) {
			System.out.println("33");
		} else {
			System.out.println("44");
		}
	}
}

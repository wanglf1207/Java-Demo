package com.demo.grammer.object;

import org.junit.Test;

public class EqualsAndHashCodeTest {
	
	@Test
	public void testEquals1() {
		
		User u1 = new User(1,"wangyueyue");
		User u2 = new User(2,"wangyueyue");
		// 比较内存地址 outputs：false
		System.out.println(u1==u2);
		System.out.println(u1.equals(u2));
		System.out.println(u1.equals(u1));
		
		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
		
	}

	@Test
	public void testEquals2() {

		String str1 = "hello";
		String str2 = "hello";
		String str3 = "hallo";

		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
	}


	
	
	private static void test3() {
		
		String str1 = "hello";
		System.out.println(str1.hashCode());
		Integer i1 = new Integer(100);
		System.out.println(i1.hashCode());
	}
}

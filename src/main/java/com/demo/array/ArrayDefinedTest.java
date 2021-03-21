package com.demo.array;

/**
 * @author wanglf
 */
public class ArrayDefinedTest {
	
	public static void main(String[] args) {
		
		int[] a = new int[5];
		for (int i=0;i<a.length;i++) {
			a[i] = i;
			System.out.println(a[i]);
		}
		System.out.println("the array a is " + a);
		
		// new TestStringArray().testStringArray();

		//ObjectArray.testObjectArray();
		
	}
}


class TestStringArray {
	void testStringArray() {
		String[] str = new String[5];
		for (String s:str) {
			System.out.println(s);
		}
	}
}

class ObjectArray {
	static void testObjectArray () {
		Person [] person;
		person = new Person[3];
		person[0] = new Person("wanglf",25);
		person[1] = new Person("jiaxinlan",50);
		person[2] = new Person("jade",26);
	}
}

class Person {
	Person(String name,int age) {
		System.out.println(name + " " + age);
	}	
}
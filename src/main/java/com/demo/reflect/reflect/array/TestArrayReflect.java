package com.demo.reflect.reflect.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestArrayReflect {
	public static void main(String[] args) {
		int[] a1 = new int[]{1,2,3};
		int[] a2 = new int[4];
		//int[][] a3 = new int[2][3];
		String[] a4 = new String[]{"a","b","c"};
		
		System.out.println(a1.getClass() == a2.getClass());
		//System.out.println(a1.getClass() == a3.getClass());
		//System.out.println(a1.getClass() == a4.getClass());
		System.out.println(a4.getClass().getName());
		System.out.println(a1.getClass().getSuperclass().getName());
		
		
		System.out.println(a1);
		System.out.println(a4);
		//�����String���͵ģ�����JDK1.4���﷨��int����Object������
		System.out.println(Arrays.asList(a1));
		System.out.println(Arrays.asList(a4));
		
		printObject(a4);
		printObject("abc");
	}
	//����ķ���
	private static void printObject(Object obj) {
		Class<? extends Object> c = obj.getClass();
		if(c.isArray()) {
			int len = Array.getLength(obj);
			for(int i=0;i<len;i++) {
				System.out.println(Array.get(obj, i));
			}
		} else {
			System.out.println(obj);
		}
	}
}

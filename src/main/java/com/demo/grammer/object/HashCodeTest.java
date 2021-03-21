package com.demo.grammer.object;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashCodeTest {

	public HashCodeTest() {
		
	}
	
	public static void main(String [] args) {
		String str1 = "studyasdfsfsdfsfsdf";
		String str2 = "study";
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println("".hashCode());
		System.out.println(str2.equals(null));
		System.out.println(str2.equals(""));
		System.out.println("".equals(""));
		//System.out.println(null.equals(null));
		
		
		System.out.println("--------------------");
		
		Set<String> set = new HashSet<String>();
		
		String str3 = "wanglifeng";
		String str4 =  "wanglifeng";
		
		set.add(str3);
		set.add(str4);
		/**
		 * ��������Ŀ�����set�е�Ԫ�ر�������
		 */
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}

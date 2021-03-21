package com.demo.container.collection;

import java.util.LinkedList;
import java.util.List;

/**
 * @author wanglf
 *
 */
public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		
		for(int i=0;i<=9;i++) {list.add("a" + i);}
		System.out.println("list = " + list);
		
		System.out.println("�漴����shuffle");
		java.util.Collections.shuffle(list);
		System.out.println("list = " + list);
		System.out.println("����reverse");
		java.util.Collections.reverse(list);
		System.out.println("list = " + list);
		
		System.out.println("��������sort");
		java.util.Collections.sort(list);
		System.out.println("list = " + list);
		
		System.out.println("�۰��ѯbinarySearch");
		System.out.println(java.util.Collections.binarySearch(list, "a3"));
	}
}

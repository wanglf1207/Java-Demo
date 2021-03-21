package com.demo.container.hashtable;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author wanglf
 *
 */
public class HashTableTest {
	
	public static void main(String[] args) {

		Map<String, Integer> hashtable = new Hashtable<String, Integer>();
		hashtable.put("one", 1);
		hashtable.put("two", 2);
		hashtable.put("three", 3);

		Integer n = hashtable.get("two");
		System.out.println("two = " + n);
	}
}
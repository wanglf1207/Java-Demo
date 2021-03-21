package com.demo.container.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author wanglf
 * ����Map�ļ��ַ�ʽ
 */
public class IteratorMapTest {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "APPLE");
		map.put(2, "ORANGE");
		map.put(3, "WATERMELON");
		
		Iterator<Entry<Integer, String>> it = map.entrySet().iterator();
		
		System.out.println("----------1-----------");
		while (it.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry entry = (Map.Entry) it.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		
		System.out.println("-----------2----------");
	    for (Object key : map.keySet()) {
	        System.out.println(key + " : " + map.get(key));
	    }
	    
	    System.out.println("-----------3----------");
	    for (Map.Entry<Integer, String> m : map.entrySet()) {
	        System.out.println(+ m.getKey() + " : " + m.getValue());
	    }
	    
	    System.out.println("-----------4----------");
		Collection<String> collection = map.values();
		Iterator<String> iterator = collection.iterator();
		System.out.println(collection);
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("------------5---------");
		Set<Integer> set = map.keySet();
		Iterator<Integer>  iterator2 = set.iterator();
		while (iterator2.hasNext()) {
			int key = iterator2.next();
			System.out.println(key + " : " + map.get(key));
		}
	}
}

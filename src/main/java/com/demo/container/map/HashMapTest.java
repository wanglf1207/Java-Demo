package com.demo.container.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public HashMapTest() {
	}
	
	private static Map<Object,Object> map = new HashMap<Object,Object>();
	
	
	/**
	 * ��Map�в�������
	 */
	public static void addData() {
		
		map.put(1,1);
		map.put(2,2);
		/**
		 * ����ظ���ӳ���ϵ(key��ͬ)�ᱻ����
		 */
		map.put(1,1);
		map.put(1,2);
		
		/**
		 * key��nullҲ�ǿ��Ե�
		 */
		map.put(null, 1);
		map.put(null, 3);
	}
	
	/**
	 * ����ִ�е����߳�
	 * @param args
	 */
	public static void main(String args[]) {
		
		/**
		 * ��Map�в�������
		 */
		addData();
		System.out.println("the map value is" + map);
		map.remove(2);
		System.out.println("after excute remove the map value is" + map);
		/**
		 * get����
		 */
		System.out.println("map.get() : " + map.get(1));
		
		/**
		 * ���Map�е�����
		 */
		map.clear();
		
		boolean isEmpty = map.isEmpty();
		System.out.println("after excute clear function,the map is empty : " + isEmpty);
		System.out.println("after excute clear function,the map's value is : " + map);
		
		addData();
		System.out.println("map.containsKey : " + map.containsKey(1));
		System.out.println("map.containsKey : " + map.containsKey(null));
		System.out.println("map.containsValue : " + map.containsValue(2));
		System.out.println("map.containsValue : " + map.containsValue(1));
		
		/**
		 * 
		 */
		Set<Entry<Object,Object>> set = map.entrySet();
		System.out.println("map.entrySet()" + set);
		
		Set<Object> keySet = map.keySet();
		System.out.println("map.keySet() : " + keySet);
		/**
		 * ��ӡmap�����ݳ���
		 */
		System.out.println(map.size());
		
		
		/**
		 * ����Map��equals����
		 */
		Map<String,String> map1 = new HashMap<String,String>();
		map1.put("1", "one");
		map1.put("2","two");
		Map<String,String> map2 = new HashMap<String,String>();
		map2.put("1", "one");
		map2.put("2","two");
		
		System.out.println("map1.entrySet() :" + map1.entrySet());
		System.out.println("map2.entrySet() :" + map2.entrySet());
		boolean boo = map1.equals(map2);
		System.out.println("map1.equals(map2) : " + boo);
		
		
		
		/**
		 * ����map��pubAll����
		 */
		Map<String, String> map3 = new HashMap<String,String>();
		map3.put("1", "apple");
		map3.put("2", "milk");
		
		Map<String,String> map4 = new HashMap<String,String>();
		map4.put("3", "orange");
		
		map4.putAll(map3);
		
		System.out.println("after excute putAll method :" + map4);
		
		/**
		 * ����values����
		 */
		Collection<String> collection = map4.values();
		System.out.println("map4.values() : " + collection);
	}
	
}

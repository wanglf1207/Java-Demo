package com.demo.container.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest1 {
	
	public static void main(String[] args) {
		
		Map<String, Object> m1 = new HashMap<String, Object>(); 
		Map<String, Object> m2 = new TreeMap<String, Object>();
		
		//m1.put("one", new Integer(1));
		//JDK1.5֮���������д����������ת��Ϊ����д��(autoboxing)����֮�н��(unboxing)
		m1.put("one", 1);
		//m1.put("two", new Integer(2));
		m1.put("two", 2);//�ӽ�ȥ����Ȼ�Ƕ���
		//m1.put("three",new Integer(3));
		m1.put("three", 3);
		//m2.put("A", new Integer(1));
		m2.put("A", 1);
		//m2.put("B", new Integer(2));
		m2.put("B", 2);
		System.out.println(m1.size());
		System.out.println(m1.containsKey("one"));
		System.out.println
		//(m2.containsValue(new Integer(2)));
		(m2.containsValue(2));
		if(m1.containsKey("two")) {
			//int i = ((Integer)m1.get("two")).intValue();
			int i = (Integer)m1.get("two");//unboxing
			System.out.println(i);
		}
		
		Map<String, Object> m3 = new HashMap<String, Object>(m1);
		m3.putAll(m2);
		System.out.println(m3);
	}
}

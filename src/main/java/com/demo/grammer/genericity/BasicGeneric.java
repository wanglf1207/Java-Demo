package com.demo.grammer.genericity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * ���ͻ�����ϰ
 * ������JDK1.5����������
 * @author wanglf1207
 *
 */
public class BasicGeneric {

	public static void main(String[] args) {

		List<Object> list1 = new ArrayList<Object>();
		list1.add(1);
		list1.add("a");
		for (int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		List<Object> list2 = new ArrayList<Object>();
		list2.add(1);
		list2.add("a");
		for (int i=0;i<list2.size();i++) {
			String str = (String) list2.get(i);
			System.out.println(str);
		}
		
		List<String> stringList = new ArrayList<String>();
		stringList.add("wanglifeng");
		stringList.add("leifuying");
		stringList.add("wanghao");
		stringList.add("wangyuehan");

		// ��ͨ��ʽ����List,���϶�Ӧ��String����֮��getʱ����ǿת��
		for (int i = 0; i < stringList.size(); i++) {
			String s = stringList.get(i);
			System.out.println(s);
		}
		System.out.println("-------------");

		// ��ǿforѭ��
		for (String s : stringList) {
			System.out.println(s);
		}

		System.out.println("-------------");
		
		Collection<String> c2 = new HashSet<String>();
		c2.add("HashSet1");
		c2.add("HashSet2");
		c2.add("HashSet3");
		Iterator<String> it = c2.iterator();
		
		//while��ʽ����
		while ( it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		System.out.println("-------------");
		// for��ʽ����
		for(Iterator<String> iterator = c2.iterator();iterator.hasNext();) {
			System.out.println(iterator.next());
		}
	}
}
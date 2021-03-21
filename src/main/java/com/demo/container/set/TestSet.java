package com.demo.container.set;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args)  {
		Set<String> s1 = new HashSet<String>();
		Set<String> s2 = new HashSet<String>();
		
		s1.add("a");s1.add("b");s1.add("c");
		
		System.out.println("s1 : " + s1);
		s2.add("a");s2.add("b");s2.add("d");
		
		Set<String> sn = new HashSet<String>(s1);
		sn.retainAll(s2);//�󽻼�
		System.out.println(sn);
		//addAll(Collection<? extends E> c) 
        //��� set ��û��ָ�� collection �е�����Ԫ�أ�������ӵ��� set �У���ѡ��������
		Set<String> su = new HashSet<String>(s1);
		su.addAll(s2);
		System.out.println(su);
		
	}
}

package com.demo.container.list;

import java.util.LinkedList;
import java.util.List;
//ListһЩ���õķ�������
public class ListTest {

	public static void main(String[] args) {
		List<String> l = new LinkedList<String>();

		for(int i=0;i<=5;i++) {
			l.add("a"+i);
		}
		System.out.println(l);
		l.add(3, "a100");
		System.out.println(l);
		l.set(6, "a200");//�滻��ԭ����Ԫ��
		System.out.println(l);
		System.out.println(l.get(2));
		System.out.println(l.indexOf("a200"));
		l.remove(1);
		System.out.println(l);

		test1();
	}


	static void test1() {
		System.out.println("ssssssssssss");
	}
}

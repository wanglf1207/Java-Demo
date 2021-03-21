package com.demo.container.list;

import java.util.LinkedList;

public class LinkListOne {

	public static void main(String[] args) {

		LinkedList<Object> list = new LinkedList<Object>();
		list.add("it");list.add("is");list.add("a");list.add("door");
		int length = list.size();
		for(int i=0;i<length;i++) {
			System.out.println("第"+i+"个节点的数据是:"+list.get(i));
		}

	}

}

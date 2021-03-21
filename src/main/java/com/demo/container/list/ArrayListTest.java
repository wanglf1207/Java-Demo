package com.demo.container.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListTest {

	public static void main(String[] args) {
		List list = new ArrayList();


		Map map = new HashMap();
		map.put("name", "������");
		map.put("age", "32");
		map.put("desc", "ʧ����");

		list.add(map);

		System.out.println(list);
	}
}

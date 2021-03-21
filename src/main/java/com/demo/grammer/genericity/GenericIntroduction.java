package com.demo.grammer.genericity;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author wanglf1207
 *
 */
public class GenericIntroduction {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("wanglf");
		list.add(33);
		
		for(int i=0;i<list.size();i++) {
			String temp = (String) list.get(i);
			System.out.println(temp);
		}
	}
}

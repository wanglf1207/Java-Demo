package com.demo.container;

import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		
		Properties property = new Properties();
		
		property.setProperty("1", "wanglf");
		property.setProperty("2", "wanghao");
		
		System.out.println(property);
	}
}

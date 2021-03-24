package com.bill.demo.reflect.classloader;

public class CreateObjectInstance {

	public static void main(String[] args) {

		// 用new的方式创建对象
		/*
		User user = new User();
		*/

		/**
		 * 2.用Class类创建对象
		 */
		try {
			Class<?> clazz = Class.forName("com.bill.demo.reflect.classloader.User");
			User user = (User)clazz.newInstance();
			user.setUsername("wanglf");user.setPassword("admin");
			System.out.println(user.toString());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException ilex) {
			ilex.printStackTrace();
		} catch (InstantiationException iex) {
			iex.printStackTrace();
		}

		/**
		 * 3.用classloader创建对象
		 */
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		try {
			Class<?> clazz = classLoader.loadClass("com.bill.demo.reflect.classloader.User");
			User user = (User) clazz.newInstance();
			user.setUsername("bill");
			user.setPassword("admin");
			System.out.println(user);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException ilex) {
			ilex.printStackTrace();
		} catch (InstantiationException iex) {
			iex.printStackTrace();
		}

	}
}

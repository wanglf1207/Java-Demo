package com.demo.jvm.classloader;

/**
 * չʾ��������ļ��ַ�ʽ
 * @author wanglf1207
 *
 */
public class CreateObjectInstance {
	
	/**
	 * 1.��new�ķ�ʽ��������
	 */
	private static void createObjectUseNew() {
		User user = new User();
		user.setUsername("������");
		System.out.println(user.getUsername());
	}
	
	/**
	 * 2.��Class�ഴ������
	 */
	private static void createObjectUseClass() {
		try {
			//forName()������������и����ַ����������ӿ�������� Class ����
			Class.forName("User");
			//clazz.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} /*catch (IllegalAccessException ilex) {
			ilex.printStackTrace();
		} catch (InstantiationException iex) {
			iex.printStackTrace();
		}*/
	}
	
	/**
	 * 3.��Classloader��������
	 */
	private static void cteateObjectUseClassLoader() {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		try {
			@SuppressWarnings("unused")
			Class<?> clazz = classLoader.loadClass("com.cn.reflect.classloader.User");
			//clazz.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}/* catch (IllegalAccessException ilex) {
			ilex.printStackTrace();
		} catch (InstantiationException iex) {
			iex.printStackTrace();
		}*/
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		createObjectUseNew();
		
		createObjectUseClass();
		
		cteateObjectUseClassLoader();
		
		
	}
}

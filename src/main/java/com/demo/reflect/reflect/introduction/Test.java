package com.demo.reflect.reflect.introduction;

/** 
 * @author wanglf1207
 * ����˵Class�����ʵ�������ڴ����һ���ֽ���
 * Class cls1 = �ֽ���1;
 * Class cls2 = �ֽ���2;
 * �ֽ������Class��ʵʵ������
 * �Ҷ���Щ�˵�������ʾ���⣬�ֽ�����Դ�ļ�������һ�ֶ����ƴ��룬��ô���ʵ�������أ�
 * ����ΪӦ������Ϊ��Class�����ʵ�������ڴ����һ���ֽ�������Ӧ��ʵ����
 * �ٷ�API�Ķ����ǣ�Class ���ʵ����ʾ�������е� Java Ӧ�ó����е���ͽӿ�
 * ��Thinking in java ������:������Ϊ����һ���ֵ�ÿ���࣬���Ƕ���һ��Class����
 * ����֮��ÿ��дһ������ʱ��ͬʱҲ�ᴴ��һ��Class����
 * ����ǡ����˵���Ǳ�����һ����ȫͬ����.class�ļ��У�
 * 
 * ��λ�ø����ֽ�������Ӧ��ʵ������
 * 1������.class  ����:String.class
 * 2������.getClass();����  new Date().getClass();
 * 3��Class.forName("����");���磺Class.forName("java.util.Date");
 * forName()��������и����ַ����������ӿ�������� Class ����
 * newInstance()������ Class ��������ʾ�����һ����ʵ����
 * ���������������ʹ�������������������֪��������֣������ڼ��ص��ڴ���
 */
public class Test {
	
	public static void main(String[] args) throws Exception {
		
		String str = "abc";
		String className = "java.lang.String";
		
		Class<?> cls1 = str.getClass();
		Class<?> cls2 = String.class;
		Class<?> cls3 = Class.forName(className);
		String cls4 = (String) Class.forName(className).newInstance();
		System.out.println("cls4.getClass()" + cls4.getClass());
		
		System.out.println(cls1 == cls2);
		System.out.println(cls2 == cls3);
		System.out.println(cls1 == cls4.getClass());
		System.out.println(str.getClass());
		
		Class<java.lang.String> c = String.class;
		System.out.println("String.class:" + c);
		
		Person p = new Person();
		System.out.println(Person.class);
		System.out.println(p.getClass());
		
		System.out.println(void.class);
	}
}

class Person {
	
	private String name;
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

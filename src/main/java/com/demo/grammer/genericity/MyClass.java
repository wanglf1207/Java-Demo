package com.demo.grammer.genericity;

/*
 * �˴�дT��A��������û�й�ϵ��ֻ�Ǳ�ʾһ������
 */
public class MyClass<T> {
	
	private T value;  
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}  

	public static void main(String[] args) {
		//��ʱȷ�������Ӧ�ķ���T��String  
		MyClass<String> clazz = new MyClass<String>();
		clazz.setValue("stringType");  
		String str = clazz.getValue();  
		System.out.println(str);  
	}
}

package com.demo.grammer.keyword.thiz;

public class Cellphone {
	
	String name;
	
	Cellphone(String name) {
		this.name = name;
	}
	public void call() {
		System.out.println(this.toString() 
				+ " ι��С����...");
	}
	@Override
	public String toString() {
		return name;
	}
	public static void main(String[] args) {
		Cellphone apple = new Cellphone("apple");
		Cellphone huawei = new Cellphone("huawei");
		
		apple.call();
		huawei.call();
	}
}

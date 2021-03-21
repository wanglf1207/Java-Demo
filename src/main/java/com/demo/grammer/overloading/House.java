package com.demo.grammer.overloading;

public class House {
	
	//���ӵ����
	private int area;
	
	House() {
		area = 0;
		System.out.println(
				"���˸�����...");
	}
	House(int area) {
		this.area = area;
		System.out.println(
				"���˸������" + area + "�ķ���...");
	}
	
	void info() {
		System.out.println(
				"�����һ�����Ϊ" + area + "�ķ��Ӱ�");
	}
	
	void info(String place) {
		 System.out.println(
				 "���Ƿ�����" + place + "λ��");
	}
}

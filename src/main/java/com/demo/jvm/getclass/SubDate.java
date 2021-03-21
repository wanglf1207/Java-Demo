package com.demo.jvm.getclass;

import java.util.Date;

public class SubDate extends Date {

	private static final long serialVersionUID = 5974039566358460694L;

	public SubDate() {
		super();
	}
	
	/*
	 * getClass()�������ص��ǵ�ǰ������ʱ�������ͣ�������SubDate
	 */
	public void getClassName() {
		System.out.println(new SubDate().getClass().getName()); //outputs com.soul.date.SubDate
		System.out.println(this.getClass().getName()); //outputs com.soul.date.SubDate
		System.out.println(super.getClass().getName()); //outputs com.soul.date.SubDate
		System.out.println(new Date().getClass().getName()); //outputs java.util.Date
	}
	
	public static void main(String[] args) {
		new SubDate().getClassName();
	}
}
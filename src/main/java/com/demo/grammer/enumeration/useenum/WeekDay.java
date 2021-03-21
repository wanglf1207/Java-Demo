package com.demo.grammer.enumeration.useenum;

public enum WeekDay {
	//��β�����÷ֺţ�Ҳ����û��
	//�����൱��ö����Ķ���
	//��ö��Ԫ�ض��������ţ���Ӧ���ô������Ĺ��췽��
	SUN(111),TUE,WED,THU,FRI,SAT,MON;
	// 1��ö�ٵĹ��췽������λ��ö�ٶ���ǰ
	// 2��ö�ٵĹ��췽������Ȩ����private
	private WeekDay(){
		System.out.println("without param constructor...");
	}
	private WeekDay(int day) {
		System.out.println("with param constructor...");
	}
}

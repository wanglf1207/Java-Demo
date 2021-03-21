package com.demo.grammer.enumeration.useenum;

public class Test {
	public static void main(String[] args) {
		WeekDay wd = WeekDay.MON;
		//��ӡֱ�����MON���ɼ�JDK������ʵ�ֲ�������toString();
		System.out.println(wd);
		System.out.println(wd.name());
		System.out.println(wd.ordinal());
		System.out.println(wd.hashCode());
		System.out.println(wd.getClass());
		//���ַ���ת�ɶ�������
		System.out.println(WeekDay.valueOf("SUN"));
		System.out.println(WeekDay.values().length);
		
		//��������
		for(WeekDay s : WeekDay.values() ) {
			System.out.print(s+ " ");
		}
	}
}

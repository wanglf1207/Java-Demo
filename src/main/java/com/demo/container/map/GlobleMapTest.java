package com.demo.container.map;


public class GlobleMapTest {

	public GlobleMapTest() {
		
	}
	
	/**
	 * ��ȫ�ֵ�map�д�����ݣ�����һ��˼�룬�ƻ�ʵ��һ��ƽ̨��ȫ��������
	 * @param args
	 */
	public static void main(String[] args) {
		
		new GlobleMapTest1().f1();
		System.out.println(GlobleMap.map1);
		new GlobleMapTest2().f2();
		System.out.println(GlobleMap.map1);
	}

}

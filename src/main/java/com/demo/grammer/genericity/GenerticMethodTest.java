package com.demo.grammer.genericity;

/**
 * ���ͷ�����ϰ
 * @author wanglf1207
 *
 */
public class GenerticMethodTest {
	
	/**
	 * ���ͷ���������ĸ�ʽ�����ͱ����������η��ĺ��桢�������͵�ǰ��
	 * @param a
	 * @return
	 */
	private static <T> T getMiddle(T [] a) {
		 return a[a.length / 2];
	}
	
	public static void main(String[] args) {
		String[] strings = {"aa", "bb", "cc"};
		String middle = GenerticMethodTest.getMiddle(strings);
		
		System.out.println(middle);
		
	}
}

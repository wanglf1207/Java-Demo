package com.demo.grammer.loop;

import java.util.ArrayList;

/**
 * ��ǿforѭ��
 * @author wanglf1207
 *
 */
public class EnhanceForLoopTest {
	public static void main(String[] args) {
		// ʹ�ü�ǿforѭ����������
		int[] arr = {1,2,3,4};
		for(int i:arr) {
			System.out.println(i);
		}
		// ʹ�ü�ǿforѭ������arraylist
		ArrayList<String> al = new ArrayList<String>();
		al.add(new String("aa"));
		al.add(new String("bb"));
		al.add(new String("cc"));
		for(String s:al) {
			System.out.println(s);
		}
	}
}
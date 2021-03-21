package com.demo.container.vector;

import java.util.Date;
import java.util.Vector;


/**
 * 
 * @author wanglf1207
 *
 */
public class VectorTest {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		Vector<Comparable> vector = new Vector<Comparable>();
		
		Date date = new Date();
		// �����������Ԫ��
		vector.add(new Integer(1));
		vector.add(new Float(3.14f));
		vector.add(new Double(7.75));
		vector.add(new Boolean(true));
		vector.add(date);
		
		System.out.println("=====�����ĳ����� : "+vector.size());
		System.out.println("=====������������ : "+vector);
		System.out.println("=====��ȡ�����е����� : "+vector.get(4));
		
		if(vector.contains(date)) {
			System.out.println("=====�����а���dateԪ��");
		}
		
	}

}

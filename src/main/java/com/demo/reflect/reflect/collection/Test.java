package com.demo.reflect.reflect.collection;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;

public class Test {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		//��ȡpropertys�ļ�
		InputStream inStream = new FileInputStream("config/config.properties");
		Properties properties = new Properties();
		properties.load(inStream);
		inStream.close();
		String className = properties.getProperty("className");
		Point a = new Point(1,2);
		Point b = new Point(2,3);
		Point c = new Point(2,3);
		Collection<Point> collection1 = (Collection<Point>)Class.forName(className).newInstance();
		//Collection<Point> collection1 = new HashSet<Point>(); 
		collection1.add(a);
		collection1.add(b);
		collection1.add(c);
		collection1.add(a);
		
		System.out.println(collection1.size());//outputs:2 ���������equals������outputs: 3
		
		Collection<Point> collection2 = new ArrayList<Point>(); 
		collection2.add(a);
		collection2.add(b);
		collection2.add(c);
		collection2.add(a);
		
		/*
		 * ������󱣴浽HashSet���Ժ����޸Ĳ���HashCodeԪ������
		 * ���� a.x = 2;
		 * ����������ڴ�й©
		 * 
		 */
		System.out.println(collection2.size());//outputs:4
		
		/*
		 * ���������equals���������õ���Object���equals����
		 * Object����equals����Դ�룬�Ƚϵ�������
		 * public boolean equals(Object obj) {
		 * return (this == obj);
		 */
		System.out.println(b.equals(c));
		//Ҫ��д�����equals�����������¶����HashCode()��������������equals,
		//���������ͬ��HashCode.

    }
		
}

class Point {
	
	private int x;
	
	private int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
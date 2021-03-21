package com.demo.grammer.keyword.thiz;

public class Leaf {
	int i = 0;
	Leaf(int i) {
		//ʹ�� this �ؼ��ֲ�����Ա������
		this.i = i;
	}
	
	Leaf increment() {
		i++;
		//this����ǰ���������
		return this;
	}
	
	void print() {
		System.out.println("i=" + i);
	}
	
	public static void main(String[] args) {
		Leaf leaf = new Leaf(100);
		leaf.increment().increment().increment().print();
	}
}

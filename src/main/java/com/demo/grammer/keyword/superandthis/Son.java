package com.demo.grammer.keyword.superandthis;

/**
 * 
 * @author wanglf1207
 * 1:super���Ե��ø���Ĺ��췽��
 * 2:�����ж���ı���Ĭ������¸��Ǹ��������������super�ؼ��ֵ��ø���ı���
 * 3:��superֱ�Ӵ��ݲ���
 * 
 */
public class Son extends Father {

	public Son() {
		super();//���ø���Ĺ��췽����һ��Ҫ���ڷ������׸����
		System.out.println("This is Son constructor...");
	}
	
	public Son(String name) {
		
		prt("һ�������Ĺ��췽��" + name);
	}

	public Son(String name,String age) {
		this("lilei");
		prt(name);
	}
	@Override
	void value() {
		name = "Nanchang";
		
		//����super.nameǰҪ�ȵ���super.value();
		super.value();
		System.out.println(super.name);
	}
	

	public static void main(String[] args) {
		
		//new Son();
		//new Son().value();
		new Son("jame","22");
	}
}

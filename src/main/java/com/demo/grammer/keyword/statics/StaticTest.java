package com.demo.grammer.keyword.statics;

public class StaticTest {

	// 成员变量必须声明为static的才能在main方法中引用，因为main方法有static修饰。
	static int i;

	public StaticTest() {

	}

	// static 修饰的方法可以在静态方法中引用
	public static void f1() {
		i = 5;
		//f2();
	}

	public void f2() {
		f1();
	}
	public static void main(String [] args) {

		System.out.println(i);

		f1();
		//f2();
		new StaticTest().f2();

		System.out.println(i);

		//System.out.println(new StaticTest().i); //不推荐该访问方式
		System.out.println(StaticTest.i);

	}

}
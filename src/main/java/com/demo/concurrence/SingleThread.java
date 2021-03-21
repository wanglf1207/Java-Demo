package com.demo.concurrence;

/**
 * 该程序只有一条执行线索，用Debug模式观察更为清晰可见
 * 按顺序执行，当method2方法执行没有返回时，method3不会执行。
 * 控制台先输出method2，在输出method1，最后输出method3
 */
public class SingleThread {

	private static void method1() {
		method2();
		System.out.println("method1...");
		method3();
	}
	private static void method2() {
		System.out.println("method2...");
	}
	private static void method3() {
		System.out.println("method3...");
	}
	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		method1();
	}
}

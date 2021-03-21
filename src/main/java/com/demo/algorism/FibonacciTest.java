package com.demo.algorism;

/**
 * 用非递归的方式实现斐波那契数列
 * @author wanglf1207
 *
 */
public class FibonacciTest {

	/**
	 *
	 * @param index
	 * @return
	 */
	public static long f(int index) {

		if(index<1) {
			System.out.println("invalid parameter!");
			return -1;
		}
		if(index == 1||index==2) {
			return 1;
		}

		long f  = 0;
		long f1 = 1L;
		long f2 = 1L;
		for(int i=0;i<index-2;i++) {
			f  = f1 + f2;
			f1 = f2;
			f2 = f;
		}
		return f;
	}
	/**
	 *
	 * @param args
	 */
	public static void main(String [] args) {
		for(int i=1;i<10;i++) {
			System.out.println(f(i));
		}
	}
}

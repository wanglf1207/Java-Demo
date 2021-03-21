package com.demo.algorism;

/**
 * 斐波那契数列，典型递归例子，注意体会
 * @author wanglf1207
 *
 */
public class Fibonacci {

	/**
	 *
	 * @param n
	 * @return
	 */
	public static long fibonacci(int n) {
		long c = 0;
		if(n==1||n==2)
			c = 1;
		else
			c = fibonacci(n-1)+fibonacci(n-2);
		return c;
	}

	/**
	 *
	 * @param args
	 */
	public static void main(String [] args) {
		for(int i=1;i<=10;i++) {
			System.out.println(fibonacci(i));
		}
	}
}

/*
 * @(#)TestArithmeticException.java	1.01 09/12/14
 * 
 */

package com.demo.exception;

/**
 * @author coyote
 * @version 1.0  09/12/14
 * @since JDK1.5
 */
public class ArithmeticExceptionTest {
	/**
	 * main method,test the ArithmeticException
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println(2/0);
		} catch (ArithmeticException e) {
			System.out.println("��������ˣ��������Ա��ϵ!");
			e.printStackTrace();
		}
	}
}
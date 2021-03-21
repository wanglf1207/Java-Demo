package com.demo.exception;

/**
 * @author wlf
 * ����ʱ�쳣����catch��Ҳ���Բ�catch����ArithmeticException,ArrayIndexOutOfBoundsException
 */
public class RuntimeExceptionTest {
	public static void divide(int i) {
		if(i == 0) throw new ArithmeticException("������0");
		System.out.println(i/9);
	}
	
	public static void main(String[] args) {
		
		//1):
		divide(0);
		
		
		//2):
		/*try{
			divide(0);
		}catch(ArithmeticException e) {
			System.out.println("������!");
			e.printStackTrace();
		}*/
	}
}

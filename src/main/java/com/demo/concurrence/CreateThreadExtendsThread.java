package com.demo.concurrence;

class MyThread1 extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()
				+ " run method execute...");
	}
}
/**
 * 通过继承Thread类的方式创建新的线程
 * @author wanglf1207
 */
public class CreateThreadExtendsThread {

	public static void main(String [] args) {
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread1();
		t1.start();t2.start();
	}
}

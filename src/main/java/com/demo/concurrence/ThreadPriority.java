package com.demo.concurrence;
/**
 * 线程优先级高的占有的CPU程序切片多
 * @author wanglf1207
 */
public class ThreadPriority {

	public static void main(String[] args) {

		Thread t1 = new Thread(new T1());
		Thread t2 = new Thread(new T2());

		t1.setPriority(Thread.NORM_PRIORITY + 3);
		System.out.println("t1的优先级别是" + t1.getPriority());
		System.out.println("t2的优先级别是" + t2.getPriority());
		t1.start();
		t2.start();
	}
}

class T1 implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("优先级别高的t1" + ":" + i);
		}
	}

}

class T2 implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("优先级别正常的t2" + "--" + i);
		}
	}

}
package com.demo.concurrence.synchronization;
/**
 * �鿴�̸߳����׶�״̬��
 * @author wanglf1207
 *
 */
class MyThread extends Thread {
	boolean waiting = true;
	boolean ready = false;

	MyThread() {
	}

	public void run() {
		String thrdName = Thread.currentThread().getName();
		System.out.println(thrdName + " ����");
		while (waiting)
			System.out.println("�ȴ���" + waiting);
		System.out.println("�ȴ�...");
		startWait();
		try {
			Thread.sleep(1000);
		} catch (Exception exc) {
			System.out.println(thrdName + " �жϡ�");
		}
		System.out.println(thrdName + " ������");
	}

	synchronized void startWait() {
		try {
			while (!ready)
				wait();
		} catch (InterruptedException exc) {
			System.out.println("wait() �жϡ�");
		}
	}

	synchronized void notice() {
		ready = true;
		notify();
	}
}

public class GetThreadStatus {
	public static void main(String args[]) throws Exception {
		MyThread thrd = new MyThread();
		thrd.setName("MyThread #1");
		showThreadStatus(thrd);
		thrd.start();
		Thread.sleep(50);
		showThreadStatus(thrd);
		thrd.waiting = false;
		Thread.sleep(50);
		showThreadStatus(thrd);
		thrd.notice();
		Thread.sleep(50);
		showThreadStatus(thrd);
		while (thrd.isAlive()) {
			System.out.println("alive");
		}
		showThreadStatus(thrd);
	}

	static void showThreadStatus(Thread thrd) {
		System.out.println(thrd.getName() + " ���:" + thrd.isAlive() + " ״̬:" + thrd.getState());
	}
}
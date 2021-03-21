package com.demo.concurrence;

public class GetCurrentGroup implements Runnable {

	public GetCurrentGroup() {
	}

	@Override
	public void run() {
		ThreadGroup tg2 = Thread.currentThread().getThreadGroup();
		System.out.println(tg2);
	}
	
	public static void main(String  [] args) {
		
		Runnable runner = new GetCurrentGroup();
		
		Thread t1 = new Thread(runner);
		
		/*
		 * ���ظ��߳��������߳��顣 ������߳��Ѿ���ֹ��ֹͣ���У����÷����򷵻� null�� 
		 */
		ThreadGroup tg1 = t1.getThreadGroup();
		System.out.println(tg1);
		t1.start();
	}

}

package com.demo.concurrence;

/**
 * �߳�ջģ��
 * �������ú������µ��߳����ڴ�������б��ʵ�����
 * @author wanglf1207
 *
 */
public class ThreadStackModel extends Thread {
	
	@Override
	public void run() {
		System.out.println("run...");
	}
	
	public static void m() {
		Thread t1 = new ThreadStackModel();
		t1.start();
	}
	public static void main(String[] args) {
		m();
	}
}

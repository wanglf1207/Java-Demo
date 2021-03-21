package com.demo.concurrence;

import java.io.IOException;

/**
 * ��̨�̲߳���
 * @author wanglf1207
 *
 */
public class DaemonThreadTest implements Runnable {
	
	private String name;
	private long delay;
	
	public DaemonThreadTest(String name, long delay) {
		this.name = name;
		this.delay = delay;
	}

	public static void main(String args[]) throws IOException {

		DaemonThreadTest r = new DaemonThreadTest("thread1", 200);
		Thread t = new Thread(r);
		
		// ��t���ú�̨�߳�
		t.setDaemon(false); 
		
		t.start();
		
		// �ȴ��û�����
		System.in.read();
		
		System.out.println("end main");
	}

	

	public void run() {
		try {
			while (true) {
				System.out.println(name);
				Thread.sleep(delay);
			}
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
}

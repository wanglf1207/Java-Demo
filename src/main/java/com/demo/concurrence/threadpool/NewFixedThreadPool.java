package com.demo.concurrence.threadpool;

class MyThread1 extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread()
				.getName() + " run...");
		super.run();
	}
}


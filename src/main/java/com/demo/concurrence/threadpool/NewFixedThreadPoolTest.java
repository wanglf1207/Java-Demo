package com.demo.concurrence.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewFixedThreadPoolTest {

	public static void main(String[] args) {

		ExecutorService pool = Executors.newFixedThreadPool(2);

		Thread t1 = new MyThread1();
		Thread t2 = new MyThread1();
		Thread t3 = new MyThread1();

		pool.execute(t1);pool.execute(t2);pool.execute(t3);


	}
}

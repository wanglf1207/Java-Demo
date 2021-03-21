package com.demo.concurrence.synchronization;

/**
 * 线程让步
 * 暂停当前正在执行的线程对象，并执行其他线程，。让出CPU,当前线程进入就绪队列等待调度。
 * 这里需要指出的是并不是让其他线程执行完之后做出让步的线程再执行，至于让出多久是不确定的，但一定会让。
 * @author wanglf1207
 *
 */
public class YieldTest {

	public static void main(String[] args) {

		MyThread4 t1 = new MyThread4("concurrence t1");
		MyThread4 t2 = new MyThread4("concurrence t2");
		t1.start();t2.start();
	}
}

class MyThread4 extends Thread {

	public MyThread4(String s) {
		super(s);
	}

	public void run() {
		/*
		 * toString()是Thread类中定义的
		 * 返回该线程的字符串表示形式，包括线程名称、优先级和线程组。
		 */
		System.out.println(this.toString());
		for(int i=0; i<100; i++) {
			System.out.println(this.getName()+":"+i);
			// 满足i%10条件时、t1对t2让步，t2对t1让步。
			if(i%10==0) {
				MyThread4.yield();
			}
		}
	}
}

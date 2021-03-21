package com.demo.concurrence.synchronization;

/**
 * 线程合并
 * @author wanglf1207
 */
public class JoinTest extends Thread {
	
	JoinTest(String threadName) {
		super(threadName);
	}
	
	@Override
	public void run() {
		for(int i=0;i<=10;i++){
			System.out.println("I am "+this.getName() + " " + i);
		}
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		JoinTest t1 = new JoinTest("mythread");
		t1.start();
		try {
			// t1线程调用join方法，作用是将t1线程与当前线程（main）合并，先先执行完t1，在执行主线程main
            // 如果这里把t1.join()注释掉，JVM会先执行主线程main。
			t1.join();
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		for(int i=0;i<=10;i++) {
			System.out.println("I am the main concurrence!");
		}
	}
}

package com.demo.concurrence;

/**
 * 获取当前线程组所有所有活动的线程
 * @author wanglf1207
 *
 */
public class EnumerateTest implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			i++;
		}
		System.out.println(Thread.currentThread().getName() +
				" finished executing.");
	}

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		EnumerateTest enumerateTest = new EnumerateTest();

		/*
		 *  create a parent ThreadGroup and a clild ThreadGroup for parent ThreadGroup
		 */
		ThreadGroup parentGroup = new ThreadGroup("Parent ThreadGroup");
		ThreadGroup subGroup = new ThreadGroup(parentGroup, "Child ThreadGroup");

		/*
		 *  create a concurrence
		 *  第二个参数enumerateTest表示其 run 方法被调用的对象，如果这些代码不写在main方法中，可以用this代替
		 */
		Thread t1 = new Thread(parentGroup, enumerateTest);
		System.out.println("Starting " + t1.getName() + "...");
		t1.start();

		/*
		 *  create another concurrence
		 */
		Thread t2 = new Thread(subGroup, enumerateTest);
		System.out.println("Starting " + t2.getName() + "...");
		t2.start();

		/*
		 * activeCount()方法返回的活动线程数目包括子线程组中活动线程的数目
		 */
		System.out.println("当前线程的线程组中活动线程的数目" + parentGroup.activeCount());
		/*
		 * returns the number of threads put into the array
		 */
		Thread[] list = new Thread[parentGroup.activeCount()];

		/*
		 * 将当前线程的线程组及其子组中的每一个活动线程复制到指定的数组中。
		 */
		int count = parentGroup.enumerate(list);

		for (int i = 0; i < count; i++) {
			System.out.println("Thread " + list[i].getName() + " found");
		}
	}
} 

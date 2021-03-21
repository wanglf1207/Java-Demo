package com.demo.concurrence.synchronization;

class Account {
	String name;
	float amt;
	public Account(String name,float amt) {
		this.name = name;this.amt = amt;
	}
	
	public void deposit(float amt) {
		this.amt += amt;
	}
	public void withdraw(float amt) {
		this.amt -= amt;
	}
	public float getAmt() {
		return this.amt;
	}
}

public class ThreadSync5 implements Runnable {
	Account account;
	public  ThreadSync5(Account account) {
		this.account = account;
	}
	@Override
	public void run() {
		synchronized (account) {
			account.deposit(500);
			account.withdraw(500);
			System.out.println(Thread.currentThread().getName() + " " + account.getAmt());
		}
	}
	
	public static void main(String[] args) {
		Account account = new Account("wanglf", 2000.0f);
		ThreadSync5 threadSync5 = new ThreadSync5(account);

		final int THREAD_NUM = 5;
		Thread threads[] = new Thread[THREAD_NUM];
		for (int i = 0; i < THREAD_NUM; i ++) {
		   threads[i] = new Thread(threadSync5, "Thread" + i);
		   threads[i].start();
		}
	}
	
}
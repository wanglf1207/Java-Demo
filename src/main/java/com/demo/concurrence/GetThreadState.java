package com.demo.concurrence;

public class GetThreadState extends Thread{

	@Override
	public void run() {
		System.out.println("��run������ �� " + Thread.currentThread().getName() 
				+ "��״̬�ǣ� " + Thread.currentThread().getState());
	}
	
	public static void m() throws InterruptedException {
		Thread t1 = new GetThreadState();
		Thread t2 = new GetThreadState();
		Thread.State state = t1.getState();
		//Thread.sleep(200);
		System.out.println("��m�����е���startǰt1��״̬�� �� " + t2.getName()
				+ " ��״̬�ǣ� " + state);
		t1.start();
		t2.start();
		
	}
	public static void main(String[] args) throws InterruptedException {
		m();
		System.out.println("��main������ �� " + Thread.currentThread().getName() 
				+ "��״̬�� �� " + Thread.currentThread().getState());
	}
}

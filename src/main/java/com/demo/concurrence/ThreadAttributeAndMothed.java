package com.demo.concurrence;

/*
 * ��ϰһ��Thread������Ժͷ���
 */
public class ThreadAttributeAndMothed {

	public ThreadAttributeAndMothed() {
		
	}
	
	/**
	 * �ڲ���
	 * @author wanglf1207
	 *
	 */
	public static class MyThread extends Thread {
		
		int i = 10;
		public void run() {
			while (i>0) {
				//System.out.println("my concurrence...");
				i--;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		
		/*
		 * �����߳��Ƿ��ڻ״̬��
		 */
		System.out.println("t1�Ƿ��ڻ״̬ : " + t1.isAlive());
		/*
		 * ����һ���߳�t1�󣬴�ӡ������һЩ����
		 */
		System.out.println("���̵߳�������: " + t1.getName());
		/*
		 * �˴���ӡ��߳���Ŀ��1����Ϊֻ�����߳�main
		 */
		System.out.println("��ǰ�̵߳��߳����л�̵߳���Ŀ: " + Thread.activeCount());
		
		System.out.println("�Ե�ǰ����ִ�е��̶߳��������: " + Thread.currentThread());
		
		/*
		 * �����߳� 
		 */
		t1.start();
		t2.start();
		
		System.out.println("t1�Ƿ��ڻ״̬ : " + t1.isAlive());
		/*
		 * �˴���ӡ��߳���Ŀ��3����Ϊ�������߳�main����t1��t2�����߳�
		 */
		System.out.println("��ǰ�̵߳��߳����л�̵߳���Ŀ: " + Thread.activeCount());
		System.out.println("�Ե�ǰ����ִ�е��̶߳��������: " + Thread.currentThread());
		
		/*
		 * ����ǰ�̵߳Ķ�ջ���ٴ�ӡ����׼������,�����ڵ�����
		 */
		//Thread.dumpStack();
	}

}

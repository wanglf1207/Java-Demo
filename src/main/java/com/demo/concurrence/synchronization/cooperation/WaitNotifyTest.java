package com.demo.concurrence.synchronization.cooperation;

class NumberPrint implements Runnable {
	
	private int number;
	public byte res[];
	
	// ѭ����
	public static int count = 5;
	
	public NumberPrint(int number, byte a[]) {
		this.number = number;
		res = a;
	}
	
	public void run() {
		synchronized (res) {
			while(count-- > 0) {
				try {
					res.wait();
					System.out.println("��ǰ�߳���" + 
							Thread.currentThread().getName());
					// ���ѵȴ�res��Դ���̣߳����������̣߳���ͬ����ִ������Զ��ͷ�����
					res.notify();
					System.out.println("res.notify()��ǰ�߳�Ϊ �� " + 
							Thread.currentThread().getName() + " number: " + number);
					// �ͷ�CPU����Ȩ���ͷ�res���������߳��������ȴ������ѡ�
					System.out.println("ִ��waitǰ...");
					res.wait();
					System.out.println("res.wait()��ǰ�߳�Ϊ ��" + 
							Thread.currentThread().getName() + " number: " + number);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			return;
		}
		
	}
}

/**
 * 
 * @author wanglf1207
 *
 */
public class WaitNotifyTest {
	public static void main(String args[]) {
		// �Ըö���Ϊ������Դ
		final byte a[] = {0};
		new Thread(new NumberPrint((1),a),"t1").start();
		new Thread(new NumberPrint((2),a),"t2").start();
	}
}

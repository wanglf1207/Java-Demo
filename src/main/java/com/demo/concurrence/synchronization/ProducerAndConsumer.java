package com.demo.concurrence.synchronization;

/**
 * ��Ʒ��
 * @author wanglf1207
 *
 */
class Product {
	int id;
	public Product(int id) {
		//super();
		this.id = id;
	}
	@Override
	public String toString() {
		return "produce"+id;
	}	
}
/**
 * ������,�Ƚ�ȥ���ó���
 * @author wanglf1207
 *
 */
class Container {
	
	//��ʾװ���ڼ�����
	int index = 0;
	//�ٶ�����Ϊ6
	Product[] p = new Product[1000];
	
	/**
	 * ��������װ�ķ���
	 * @param p
	 */
	public synchronized void push(Product p) {
		//������װ����ʱ��
		//this.wait��ʾ�������ڵ�ǰ������̵߳ȴ�
		//��while��ʹ��if�����ʣ�������쳣�������
		while(index == this.p.length) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notifyAll();
		this.p[index] = p;
		index ++;
	}
	/**
	 * ������ȡ����
	 * @return
	 */
	public synchronized Product pop() {
		while(index==0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// �����ڴ˶���������ϵȴ��ĵ����̡߳�
		this.notifyAll();
		index --;
		return p[index];
	}
}
//������
class Producer implements Runnable {
	//�����ߵ�֪�������Ǹ�������װ������������������һ������
	Container c = null;
	//���������ߵ�ʱ����������Ǹ�����������������������췽���Ǳ�Ҫ��
	public Producer(Container c) {
		super();
		this.c = c;
	}
	//������Ʒ�ķ���
	public void produce() {
		for(int i=0;i<1000;i++) {
			Product p = new Product(i);
			c.push(p);
			System.out.println("������:" + p);
			try {
				Thread.sleep((int)(Math.random())*50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public void run() {
		produce();
	}
}

//������
class Consumer implements Runnable {
	//�����ߵ�֪�������Ǹ�������װ������������������һ������
	Container c = null;
	//���������ߵ�ʱ����������Ǹ�����������������������췽���Ǳ�Ҫ��
	public Consumer(Container c) {
		super();
		this.c = c;
	}
	//���Ѳ�Ʒ�ķ���
	public void consume() {
		for(int i=0;i<1000;i++) {
			Product p = c.pop();
			System.out.println("������:" + p);
			try {
				Thread.sleep((int)(Math.random())*50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public void run() {
		consume();
	}
}

/**
 * �����������������߳���
 * ��������������Ŷ�����ͬʱ������ȡ��ȥ
 * @author wanglf1207
 */
public class ProducerAndConsumer {
	public static void main(String[] args) {
		Container container = new Container();
		Producer producer = new Producer(container);
		Consumer consumer = new Consumer(container);
		new Thread(producer).start();
		new Thread(consumer).start();
		new Thread(producer).start();
	}
}
package com.demo.concurrence.synchronization;

/**
 * synchronized����һ�������
 */
class NumberBox8 { 
	
    private int x = 100; 
    
    public int getX() { 
        return x; 
    } 
    public void subtraction(int y) { 
    	synchronized(ThreadSync8.class) {
    		for (int i=0; i<5; i++) { 
    			x = x-y; 
    			try {
    				Thread.sleep(50);
    			} catch (InterruptedException e) {
    				e.printStackTrace();
    			}
    			System.out.println(Thread.currentThread().getName()
    					+ " xֵ  = " + x); 
    		} 
    	}
    } 
}
/**
 * 	
 * @author wanglf1208
 *
 */
public class ThreadSync8 implements Runnable { 
	NumberBox8 numberBox8 = new NumberBox8();
    public void run() { 
    	numberBox8.subtraction(10);
    } 
    /**
     * 
     * @param args
     */
    public static void main(String[] args) { 
    	Runnable r = new ThreadSync8();
        Thread t1 = new Thread(r,"t1"); 
        Thread t2 = new Thread(r,"t2"); 
        t1.start(); t2.start(); 
    } 
}



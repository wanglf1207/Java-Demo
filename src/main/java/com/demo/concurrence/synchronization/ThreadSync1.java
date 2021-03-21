package com.demo.concurrence.synchronization;

/**
 * synchronized����һ�������
 */
class NumberBox1 { 
	
    private int x = 100; 
    
    public int getX() { 
        return x; 
    } 
    public int subtraction(int y) { 
        x = x-y; 
        return x; 
    } 
}
/**
 * 	
 * @author wanglf1207
 *
 */
public class ThreadSync1 implements Runnable { 
	
    private NumberBox1 numberBox1 = new NumberBox1(); 

    public void run() { 
    	synchronized(this) {
		    for (int i=0; i<5; i++) { 
		    	numberBox1.subtraction(10);
		    	try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		        System.out.println(Thread.currentThread().getName()
		        		+ " xֵ  = " + numberBox1.getX()); 
		    } 
    	}
    } 
    /**
     * 
     * @param args
     */
    public static void main(String[] args) { 
    	
        Runnable r = new ThreadSync1(); 
        
        Thread t1 = new Thread(r, "concurrence-t1");
        Thread t2 = new Thread(r, "concurrence-t2");
        t1.start(); t2.start(); 
    } 
}



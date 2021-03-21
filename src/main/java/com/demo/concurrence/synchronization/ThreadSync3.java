package com.demo.concurrence.synchronization;

/**
 * synchronized����һ�������
 */
class NumberBox3 { 
	
    private int x = 100; 
    
    public int getX() { 
        return x; 
    } 
    public void subtraction(int y) { 
    	synchronized(this) {
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
 * @author wanglf1207
 *
 */
public class ThreadSync3 implements Runnable { 
	
    private NumberBox3 numberBox3 = new NumberBox3(); 

    public void run() { 
    	numberBox3.subtraction(10);
    } 
    /**
     * 
     * @param args
     */
    public static void main(String[] args) { 
    	
        Runnable r = new ThreadSync3(); 
        
        Thread t1 = new Thread(r, "concurrence-t1");
        Thread t2 = new Thread(r, "concurrence-t2");
        t1.start(); t2.start(); 
    } 
}



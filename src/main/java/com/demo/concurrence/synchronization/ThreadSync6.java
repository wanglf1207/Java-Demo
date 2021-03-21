package com.demo.concurrence.synchronization;

/**
 * synchronized����һ�������
 */
class NumberBox6 { 
	
    private int x = 100; 
    
    public int getX() { 
        return x; 
    } 
    public synchronized void subtraction(int y) { 
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
/**
 * 	
 * @author wanglf1207
 *
 */
public class ThreadSync6 implements Runnable { 
	
    private NumberBox6 numberBox6 = new NumberBox6(); 

    public void run() { 
    	numberBox6.subtraction(10);
    } 
    /**
     * 
     * @param args
     */
    public static void main(String[] args) { 
    	
        Runnable r = new ThreadSync6(); 
        
        Thread t1 = new Thread(r, "concurrence-t1");
        Thread t2 = new Thread(r, "concurrence-t2");
        t1.start(); t2.start(); 
    } 
}



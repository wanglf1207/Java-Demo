package com.demo.concurrence.synchronization;

/**
 * synchronized����һ�������
 */
class NumberBox7 { 
	
    private static int x = 100; 
    
    public int getX() { 
        return x; 
    } 
    public synchronized static void subtraction(int y) { 
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
public class ThreadSync7 extends Thread { 
	
    public void run() { 
    	NumberBox7.subtraction(10);
    } 
    /**
     * 
     * @param args
     */
    public static void main(String[] args) { 
        Thread t1 = new ThreadSync7(); 
        Thread t2 = new ThreadSync7(); 
        t1.start(); t2.start(); 
    } 
}



package com.demo.concurrence.synchronization;

/**
 * synchronized����һ�������
 */
class NumberBox4 { 
	
    private int x = 100; 
    private int z = 100;
    public int getX() { 
        return x; 
    } 
    
    public void addition(int y) {
    	for (int i=0; i<5; i++) { 
    		z = z+y;
    		System.out.println("addition������" + Thread.currentThread().getName()
	        		+ " zֵ  = " + z); 
    	}
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
		        System.out.println("subtraction������ " + Thread.currentThread().getName()
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
public class ThreadSync4 implements Runnable { 
	
    private NumberBox4 numberBox4 = new NumberBox4(); 

    public void run() { 
    	if("concurrence-t1".equals(Thread.currentThread().getName())) {
    		numberBox4.subtraction(10);
    	} else if ("concurrence-t2".equals(Thread.currentThread().getName())) {
    		numberBox4.addition(10);
    	}
    	
    } 
    /**
     * 
     * @param args
     */
    public static void main(String[] args) { 
    	
        Runnable r = new ThreadSync4(); 
        
        Thread t1 = new Thread(r, "concurrence-t1");
        Thread t2 = new Thread(r, "concurrence-t2");
        t1.start(); t2.start(); 
    } 
}



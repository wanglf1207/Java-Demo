package com.demo.concurrence.synchronization.mutualexclusion;

/**
 * NumberBox0����һ�����ֺ��ӣ��������ṩ��һ��subtraction
 * ������������������������x�����
 */
class NumberBox0 { 
	
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
public class ThreadSync0 implements Runnable { 
	
    private NumberBox0 numberBox0 = new NumberBox0(); 

    public void run() { 
	    for (int i=0; i<5; i++) { 
	    	numberBox0.subtraction(10);
	        System.out.println(Thread.currentThread().getName()
	        		+ " x  = " + numberBox0.getX()); 
	    } 
    } 
    /**
     * 
     * @param args
     */
    public static void main(String[] args) { 
    	
        Runnable r = new ThreadSync0(); 
        
        new Thread(r, "concurrence-1").start();
        new Thread(r, "concurrence-2").start();
    } 
}



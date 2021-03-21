package com.demo.concurrence;

class Runner9 implements Runnable {
	
  private boolean flag=true;
  
	public void run() {
		int i = 0;
		while (flag==true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("run()-----" + i++);	
		}
	}
	
  public void shutDown() {
		flag = false;
  }
}
public class InterruptTest {	
	
	public static void main(String args[]) {
		
		Runner9 r = new Runner9();
       	Thread t = new Thread(r);
        t.start();
        
        for(int i=0;i<1000;i++) {
        	try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        	if(i%100==0 & i>0) {
        		System.out.println("in concurrence main i=" + i);
        		r.shutDown();
        	}
        }
        System.out.println("Thread main is over");
       
        //t.stop();
    }
}
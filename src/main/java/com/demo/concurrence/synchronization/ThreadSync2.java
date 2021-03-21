package com.demo.concurrence.synchronization;

/**
 * synchronized修饰一个代码块
 */
class NumberBox2 {

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
public class ThreadSync2 implements Runnable {

    private NumberBox2 numberBox2 = new NumberBox2();

    public void run() {
        synchronized(this) {
            for (int i=0; i<5; i++) {
                numberBox2.subtraction(10);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()
                        + " x值  = " + numberBox2.getX());
            }
        }
    }
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadSync2(), "concurrence-t1");
        Thread t2 = new Thread(new ThreadSync2(), "concurrence-t2");
        t1.start(); t2.start();
    }
}



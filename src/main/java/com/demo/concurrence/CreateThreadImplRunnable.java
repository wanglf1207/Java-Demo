package com.demo.concurrence;


/**
 * 实现Runnable接口的方式创建新的线程
 * @author wanglf1207
 *
 */
public class CreateThreadImplRunnable implements Runnable {

    @Override
    public void run() {
        //while (true) {
        System.out.println(Thread.currentThread().getName() + " : run method...");
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //}
    }

    public static void main(String[] args) {

        Runnable runner = new CreateThreadImplRunnable();

        Thread t1 = new Thread(runner,"t1");
        Thread t2 = new Thread(runner,"t2");
        Thread t3 = new Thread(runner,"t3");

        t1.start();t2.start();t3.start();

        // 下面直接以方法调用的方式条用run方法，实际上此处仍旧使用了线程，即总是分配给main线程
		/*CreateThreadImplRunnable runner1 = new CreateThreadImplRunnable();
		runner1.run();*/
    }
}

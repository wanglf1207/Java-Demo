package com.bill.juc;

import java.util.concurrent.TimeUnit;

public class T001_WhatIsThread {
    private static class T1 extends Thread {
        @Override
        public void run() {
            for (int i=0;i<10;i++) {
                try {
                    TimeUnit.MICROSECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("T1");
            }
        }
    }

    public static void main(String[] args) {
        new T1().run(); // 先把T1打印完毕，在打印main
        //new T1().start(); // T1和main交替输出

        for (int i=0;i<10;i++) {
            try {
                TimeUnit.MICROSECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main");
        }
    }
}

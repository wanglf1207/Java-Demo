package com.demo.concurrence;
/**
 * 通过匿名内部类的方式创建线程，该方式非常常见
 * 既没有继承Thread也没有实现Runable
 * @author wanglf1207
 */
public class CreateThreadUseAnonymousInnerClass {

    public static void main(String [] args) {

        new Thread() {
            public void run() {
                System.out.println("I am a new concurrence");
            }
        }.start();

        new Thread(new Runnable(){
            public void run() {
                System.out.println("I am anothor new concurrence");
            }
        }).start();
    }
}

package com.demo.concurrence;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CreateThreadUseCallable implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		int i = 0;
		for (; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		return i;
	}

	public static void main(String[] args) {

		CreateThreadUseCallable ctt = new CreateThreadUseCallable();

		FutureTask<Integer> ft = new FutureTask<>(ctt);

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " 的循环变量i的值" + i);
			new Thread(ft, "有返回值的线程").start();
		}

		try {
			System.out.println("子线程的返回值：" + ft.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}

}

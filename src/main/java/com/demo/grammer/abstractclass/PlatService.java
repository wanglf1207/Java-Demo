package com.demo.grammer.abstractclass;

public class PlatService {
	public void init() {
		TaskScanner t = new FileTask();
		Thread thread = new Thread(t);
		thread.start();
	}
	

	
	public static void main(String[] args) {
		new PlatService().init();
	}

}

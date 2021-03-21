package com.demo.grammer.abstractclass;

public abstract class TaskScanner  implements Runnable {

	public void scannTask(String str) {
		chkDpo("A");
	}
	
	public void chkDpo(String str) {
		System.out.println(str);
	}

	@Override
	public void run() {
		scannTask("--");
		
	}
	
}

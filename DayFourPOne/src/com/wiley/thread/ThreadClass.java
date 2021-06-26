package com.wiley.thread;

public class ThreadClass  extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Id: "+Thread.currentThread().getId()+" ThreadName: "+Thread.currentThread().getName()+" life : "+Thread.currentThread().isAlive()+" Status: "+Thread.currentThread().getState()+" Priority Status: "+Thread.currentThread().getPriority());
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.wiley.thread;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadClass t1=new ThreadClass();
		ThreadClass t2=new ThreadClass();
		ThreadClass t3=new ThreadClass();
		ThreadClass t4=new ThreadClass();
		t1.start();
		t2.start();
		t3.start();

		t4.start();
	}

}

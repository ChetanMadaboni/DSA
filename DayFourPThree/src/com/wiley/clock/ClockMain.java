package com.wiley.clock;

public class ClockMain {

	public static void main(String[] args) {
		Clock c=new Clock();
		Thread tic1=new Thread(new Tick(c));
		Thread tac1=new Thread(new Tack(c));
		Thread toc1=new Thread(new Tock(c));
		tic1.start();
		tac1.start();
		toc1.start();
		
	}

}

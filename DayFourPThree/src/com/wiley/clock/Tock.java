package com.wiley.clock;

public class Tock implements Runnable {
	Clock clock;
	Tock(Clock clock){
		super();
		this.clock=clock;
	}
	@Override
	public void run() {
		for(int i=1;i<=60;i++) {
			clock.Tock(i);
			//System.out.println();
		}

	}

}

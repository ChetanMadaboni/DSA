package com.wiley.clock;

public class Tack implements Runnable {
	Clock clock;
	Tack(Clock clock){
		super();
		this.clock=clock;
	}
	@Override
	public void run() {
		for(int i=1;i<=60;i++) {
			clock.Tack(i);
		}
		
	}

}

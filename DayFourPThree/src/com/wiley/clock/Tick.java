package com.wiley.clock;

public class Tick implements Runnable {
	Clock clock;
	
	Tick(Clock clock){
		super();
		this.clock=clock;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=60;i++) {
			clock.Tick(i);
		}
		
	}

}

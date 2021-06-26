package com.wiley.Egg;

public class EggJob implements Runnable {
	Egg e;
	
	EggJob(Egg e){
		this.e=e;
	}
	@Override
	public void run() {
		for(int i=1;i<=50;i++) {
			e.eggLaid(i);
		}

	}

}

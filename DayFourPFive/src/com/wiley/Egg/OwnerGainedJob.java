package com.wiley.Egg;

public class OwnerGainedJob implements Runnable {
	Egg e;
	OwnerGainedJob(Egg e){
		this.e=e;
	}
	@Override
	public void run() {
		for(int i=1;i<=50;i++) {
			e.ownerGained(i*2);
		}

	}

}

package com.wiley.vehicle;

public class TollgateJob implements Runnable {
VehicleStatus vs;
	
	public TollgateJob(VehicleStatus vs) {
		super();
		this.vs=vs;
	}
	
	@Override
	public void run() {
		
			for(int i=1;i<=5;i++) {
				vs.crossingTollgate(i);
			}
	

	}

}

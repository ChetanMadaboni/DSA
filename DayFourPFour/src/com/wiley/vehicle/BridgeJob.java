package com.wiley.vehicle;

public class BridgeJob implements Runnable {
	VehicleStatus vs;
	
	public BridgeJob(VehicleStatus vs) {
		super();
		this.vs=vs;
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			vs.crossingBridge(i);
		}
		
	}
	

}

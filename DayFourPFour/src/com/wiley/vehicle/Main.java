package com.wiley.vehicle;

public class Main {

	public static void main(String[] args) {
		VehicleStatus vs=new VehicleStatus();
		Thread t1=new Thread(new BridgeJob(vs));
		Thread t2=new Thread(new TollgateJob(vs));
		t1.start();
		t2.start();
	}

}

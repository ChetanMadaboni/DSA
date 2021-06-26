package com.wiley.vehicle;

public class VehicleStatus {
	static boolean flag=false;
	synchronized void crossingBridge(int i) {
		while(flag!=false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(" Vehicle Number With- "+i+"Crossed the bridge");
		flag=true;
		notify();
		
	}
	synchronized void crossingTollgate(int i) {
		while(flag!=true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(" Vehicle Number With- "+i+"Crossed the Tollgate");
		flag=false;
		notify();
	}
}

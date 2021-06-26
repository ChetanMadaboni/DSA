package com.wiley.Egg;

public class Egg {
	static boolean flag=false;
	synchronized void eggLaid(int i) {
		if(flag!=false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Hen Laid the Egg- "+i);
		flag=true;
		notify();
	}
	synchronized void ownerGained(int i) {
		if(flag!=true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Owner gained Rs- "+i);
		flag=false;
		notify();
	}
}

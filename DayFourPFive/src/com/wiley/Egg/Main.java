package com.wiley.Egg;

public class Main {

	public static void main(String[] args) {
		Egg e=new Egg();
		Thread t1=new Thread(new EggJob(e));
		Thread t2=new Thread(new OwnerGainedJob(e));
		t1.start();
		t2.start();

	}

}

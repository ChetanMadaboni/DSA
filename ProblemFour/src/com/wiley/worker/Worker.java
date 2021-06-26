package com.wiley.worker;

public abstract class Worker {
	
	public static int salaryrate;
	public static String name;
	Worker(String name,int salaryrate) {
		this.salaryrate = salaryrate;
		this.name = name;
	}
	abstract int Pay();
}

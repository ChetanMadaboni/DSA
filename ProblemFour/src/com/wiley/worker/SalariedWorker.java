package com.wiley.worker;

public class SalariedWorker extends Worker{
	private static int hours;
	public SalariedWorker(String name,int salaryrate,int hours){
		super(name,salaryrate);
		this.hours=hours;
	}
	@Override
	int Pay() {
		int days=hours/(24*7);
		return days*40;
	}
}

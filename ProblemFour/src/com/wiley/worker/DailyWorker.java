package com.wiley.worker;

public class DailyWorker extends Worker{
	private static int hours;
	public DailyWorker(String name, int salaryrate,int hours) {
		super(name, salaryrate);
		this.hours=hours;
	}

	

	@Override
	int Pay() {
			int days=hours/24;
			return salaryrate*days;
	}
	
}

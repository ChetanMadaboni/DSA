package com.wiley.worker;

public class MainClass {

	public static void main(String[] args) {
		DailyWorker dw=new DailyWorker("person1",200,40);
		System.out.println(dw.Pay());
		SalariedWorker sw=new SalariedWorker("person2",300,200);
		System.out.println(sw.Pay());
	}

}

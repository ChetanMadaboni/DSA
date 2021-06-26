package com.wiley.egg;

public class CalculateEgg {
	
	EggUnit eu=new EggUnit(1342);
	
	
	public void calculateUnits() {
		int gross=calculate(eu.getInputNumber(),144);
		int dozen=calculate(eu.getInputNumber()-gross*144,12);
		int leftover=eu.getInputNumber()-((gross*144)+(dozen*12));
		System.out.println("Your number of eggs is "+gross+" gross"+" "+dozen+" dozen and "+leftover);
	}
	
	
	private static int calculate(int n,int value) {
		int result=n/value;
		return result;
	}
	
}

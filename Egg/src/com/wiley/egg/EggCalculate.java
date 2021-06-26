package com.wiley.egg;

public class EggCalculate {
	private int eggcount;
	public void setCount(int ec) {
		eggcount=ec;
	}
	public EggUnit calculate() {
		int gross=eggcount/144;
		int dozen=(eggcount-(gross*144))/12;
		int left=eggcount-((gross*144)+(dozen*12));
		return new EggUnit(gross,dozen,left);
	}
}

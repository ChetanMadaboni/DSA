package com.wiley.lambda;

public class Dishes {
	private boolean vegetarian;
	private String dish;
	
	public Dishes() {
		
	}
	
	
	public Dishes(boolean vegetarian, String dish) {
		super();
		this.vegetarian = vegetarian;
		this.dish = dish;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	public String getDish() {
		return dish;
	}
	public void setDish(String dish) {
		this.dish = dish;
	}


	@Override
	public String toString() {
		return "Dishes [vegetarian=" + vegetarian + ", dish=" + dish + "]";
	}
	
}

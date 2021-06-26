package com.wiley.popcorn;

public class ShoppingMall {
	PopCorn popcorn;
	public void setPopCorn(PopCorn pc) {
		popcorn=pc;
	}
	public void buy() {
		popcorn.pop();
	}
}

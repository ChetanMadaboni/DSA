package com.wiley.popcorn;

public class MainDriver {

	public static void main(String[] args) {
		PopCorn pc1=new MetaPopCron();
		ShoppingMall sm=new ShoppingMall();
		sm.setPopCorn(pc1);
		sm.buy();
		
	}

}

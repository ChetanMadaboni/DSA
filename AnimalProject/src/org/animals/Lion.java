package org.animals;

public class Lion extends Animal {
	
	public Lion(String color,int age,int weight){
		super(color,age,weight);
	}

	@Override
	public void isVegetarian() {
		System.out.println("Lion is not a vegetarian");
		
	}

	@Override
	public void canClimb() {
		System.out.println("Lion Cannot Climb Trees");
		
	}

	@Override
	public void sound() {
		
		System.out.println("Lion Roars");
	}
	
}

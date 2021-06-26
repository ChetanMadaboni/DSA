package org.animals;

public class Elephant extends Animal {
	public Elephant(String color,int age,int weight){
		super(color,age,weight);
	}

	@Override
	public void isVegetarian() {
		System.out.println("Elephant is a vegetarian");
		
	}

	@Override
	public void canClimb() {
		System.out.println("Elephant cannot climb");
		
	}

	@Override
	public void sound() {
		System.out.println("Elephant makes trumphet sound");
		
	}

}

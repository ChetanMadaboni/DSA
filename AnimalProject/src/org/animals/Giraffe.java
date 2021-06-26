package org.animals;

public class Giraffe extends Animal {
	public Giraffe(String color,int age,int weight){
		super(color,age,weight);
	}

	@Override
	public void isVegetarian() {
		System.out.println("Giraffe is a vegetarian");
		
	}

	@Override
	public void canClimb() {
		System.out.println("Giraffe cannot climb");
		
	}

	@Override
	public void sound() {
		System.out.println("Giraffe makes bleat sound");
		
	}
}

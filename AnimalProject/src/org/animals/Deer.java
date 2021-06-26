package org.animals;

public class Deer extends Animal {
	public Deer(String color,int age,int weight){
		super(color,age,weight);
	}
	@Override
	public void isVegetarian() {
		System.out.println("Deer is vegetarian");
		
	}

	@Override
	public void canClimb() {
		System.out.println("Deer cannot Climb");
		
	}

	@Override
	public void sound() {
		System.out.println("Deer makes bluck sound");
		
	}

}

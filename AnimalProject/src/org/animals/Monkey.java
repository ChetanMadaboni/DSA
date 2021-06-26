package org.animals;

public class Monkey extends Animal {
	public Monkey(String color,int age,int weight){
		super(color,age,weight);
	}
	@Override
	public void isVegetarian() {
		System.out.println("Monkey is a vegetarian");
		
	}

	@Override
	public void canClimb() {
		System.out.println("Monkey can climb");
		
	}

	@Override
	public void sound() {
		System.out.println("Monkey makes chatter sound");
		
	}
}

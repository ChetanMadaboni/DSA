package org.animals;

public class Tiger extends Animal{
	public Tiger(String color,int age,int weight){
		super(color,age,weight);
	}
	@Override
	public void isVegetarian() {
		System.out.println("Tiger is a non-vegetarian");
		
	}

	@Override
	public void canClimb() {
		System.out.println("Tiger can climb");
		
	}

	@Override
	public void sound() {
		System.out.println("Tiger Roars");
		
	}

}

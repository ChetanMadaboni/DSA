package org.animals;

public abstract class Animal {
	private static String color;
	private static int age, weight;
	
	public Animal(String color,int age,int weight){
		super();
		this.color=color;
		this.age=age;
		this.weight=weight;
	}
	
	public static int getAge() {
		return age;
	}



	public static int getWeight() {
		return weight;
	}

	public static String getColor() {
		return color;
	} 
	public abstract void isVegetarian();
	public abstract void canClimb();
	public abstract void sound(); 
}

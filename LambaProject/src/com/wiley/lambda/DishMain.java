package com.wiley.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class DishMain {

	public static void main(String[] args) {
		List<Dishes> dish=Arrays.asList(new Dishes(false,"chicken"),new Dishes(true,"Palak"),new Dishes(false,"Mutton"));
		List<Dishes> vegetarian=dish.stream().filter(d->d.isVegetarian()).collect(Collectors.toList());
		System.out.println(vegetarian.toString());

	}

}

package org.zoo;

import org.animals.Animal;
import org.animals.Deer;
import org.animals.Elephant;
import org.animals.Giraffe;
import org.animals.Lion;
import org.animals.Monkey;
import org.animals.Tiger;
import java.util.*;
public class VandalurZoo {

	public static void main(String[] args) {
		//ArrayList<Animal> arr=new ArrayList<>();
		Tiger tg=new Tiger("yellow",13,120);
		Deer dr=new Deer("brown",22,80);
		Elephant el=new Elephant("grey",10,500);
		Lion li=new Lion("Yellow",12, 200);
		Monkey mk=new Monkey("light brown",12,30);
		Giraffe gr=new Giraffe("light yellow",12,90);
//		arr.add(el);
//		arr.add(dr);
//		arr.add(li);
//		arr.add(tg);
//		arr.add(mk);
//		arr.add(gr);
//		for(int i=0;i<6;i++) {
//			System.out.println(arr.get(i).getColor());
//		}
		
		 System.out.println("Tiger color is: "+tg.getColor());
		 System.out.println("Tiger age is: "+tg.getAge());
		 System.out.println("Tiger weight is: "+tg.getWeight());
		 tg.isVegetarian();
		 tg.canClimb();
		 tg.sound();
		 System.out.println();
		 System.out.println("Deer color is: "+dr.getColor());
		 System.out.println("Deer age is: "+dr.getAge());
		 System.out.println("Deer weight is: "+dr.getWeight());
		 dr.isVegetarian();
		 dr.canClimb();
		 dr.sound();
		 System.out.println();
		 System.out.println("Elephant color is: "+el.getColor());
		 System.out.println("Elephant age is: "+el.getAge());
		 System.out.println("Elephant weight is: "+el.getWeight());
		 el.isVegetarian();
		 el.canClimb();
		 el.sound();
		 System.out.println();
		 System.out.println("lion color is: "+li.getColor());
		 System.out.println("lion age is: "+li.getAge());
		 System.out.println("lion weight is: "+li.getWeight());
		 li.isVegetarian();
		 li.canClimb();
		 li.sound();
		 System.out.println();
		 System.out.println("Monkey color is: "+mk.getColor());
		 System.out.println("Monkey age is: "+mk.getAge());
		 System.out.println("Monkey weight is: "+mk.getWeight());
		 mk.isVegetarian();
		 mk.canClimb();
		 mk.sound();
		 System.out.println();
		 System.out.println("Giraffe color is: "+gr.getColor());
		 System.out.println("Giraffe age is: "+gr.getAge());
		 System.out.println("Giraffe weight is: "+gr.getWeight());
		 gr.isVegetarian();
		 gr.canClimb();
		 gr.sound();

	}

}

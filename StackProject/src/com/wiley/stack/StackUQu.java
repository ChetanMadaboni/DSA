package com.wiley.stack;

import java.util.LinkedList;
import java.util.Queue;
//in implementing stack using queue;
//algorithm
//for push-> fist we add into q1 array;
//then we pop all the elements from q2->q1;
//then swap the elements between q1 and q2;

public class StackUQu {
	static Queue<Integer> q1=new LinkedList<Integer>();
	static Queue<Integer> q2=new  LinkedList<Integer>();
	
	static void push(Integer n) {
		//first we are adding it into the first qu
		q1.add(n);
		//we are copying all the element from q2->q1;
		while(!q2.isEmpty()) {
			q1.add(q2.poll());
		}
		//we are moving all the element from q1->q2
		//poll means removing the first added element;
		while(!q1.isEmpty()) {
			q2.add(q1.poll());
		}
	}
	static void pop() {
		if(q2.isEmpty()) {
			System.out.println("It is already empty");
		}else {
			q2.poll();
		}
		
	}
	static void top() {
		//we will get the top value by using peek;
		System.out.println("top"+q2.peek());
	}
	static void display() {
		System.out.println(q2);
	}
	public static 
	void main(String[] args) {
		push(new Integer(3));
		push(new Integer(4));
		push(new Integer(2));
		push(new Integer(1));
		display();
		top();
		pop();
		top();

	}

}

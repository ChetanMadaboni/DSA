package com.wiley.stack;

public class StackArr {
	static int top=-1;
	static int arr[]=new int[99];	
	static void push(int num) {
		if(top==99) {
			System.out.println("overflow");
		}else {
			arr[++top]=num;
		}
		
	}
	static void top() {
		System.out.println(arr[top]);
	}
	static void pop() {
		if(top==-1) {
			System.out.println("It is already Empty");
		}else {
			System.out.println(arr[top]);
			--top;
		}
	}
	static void display() {
		for(int i=top;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		
		push(3);
		push(4);
		push(2);
		push(1);
		display();
		pop();
		System.out.println("---");
		display();
	}

}

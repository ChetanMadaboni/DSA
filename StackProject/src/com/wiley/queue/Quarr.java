package com.wiley.queue;

public class Quarr {
	static int []arr;
	static int rear=-1,front=0,n;
	static void Enque(int n) {
		if(rear==n) {
			System.out.println("Overflow");
		}else {
			arr[++rear]=n;
		}
	}
	static void Deque() {
		if(rear==-1 || front==n-1) {
			System.out.println("AlreadyEmpty");
		}else {
			front++;
		}
	}
	
	static void front() {
		System.out.println(arr[front]);
	}
	static void rear() {
		System.out.println(arr[rear]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n=5;
		arr=new int[n];
		Enque(3);
		Enque(2);
		Enque(4);
		Enque(1);
		Enque(5);
		Enque(6);
		front();
		rear();
		Deque();
		front();
	
	}

}

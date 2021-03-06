package com.wiley.queue;

public class QuLL {
	static Node head;
	static int front=0,rear=-1,n,c=-1;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	static void Enque(Node node){
		if(c==n-1) {
			System.out.println("Overflow");
		}else {
			Node cur=node;
			if(head==null) {
				head=cur;
				front=node.data;
			}else {
				Node cur1=head;
				while(cur1.next!=null) {
					cur1=cur1.next;
				}
				cur1.next=node;
				rear=node.data;
			}

			++c;
		}
	}
	
	static void Deque() {
		if(c<0 || head==null) {
			System.out.println("Underflow");	
		}else {
			head=head.next;
			front=head.data;
			c--;
		}
		
	}
	static void front() {
		System.out.println(front);
	}
	 static void rear() {
		System.out.println(rear);
	}
	 
	 static void print() {
		 Node cur=head;
		 while(cur!=null) {
			 System.out.println(cur.data);
			 cur=cur.next;
		 }
	 }
	public static void main(String[] args) {
		n=4;
		Enque(new Node(3));
		Enque(new Node(2));
		Enque(new Node(4));
		Enque(new Node(1));
		print();
		Deque();
		System.out.println("--");
		print();
		System.out.println("--");
		front();
		
	}

}

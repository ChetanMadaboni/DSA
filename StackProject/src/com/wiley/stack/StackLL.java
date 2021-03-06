package com.wiley.stack;

public class StackLL {
	Node head;
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
		
		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
		
	}
	
	void push(Node node) {
		Node cur=node;
		if(head==null) {
			head=cur;
		}else {
			cur.next=head;
			head=cur;
		}
	}
	void display() {
		if(head==null) {
			System.out.println("Already Empty");
		}else {
			Node cur=head;
			System.out.println("display:");
			while(cur!=null) {
				System.out.print(cur.data+" -> ");
				cur=cur.next;
			}
		}
	}
	 void pop() {
		 if(head==null) {
			 System.out.println("Already Empty");
		 }else {
			 head=head.next;
		 }
	 }
	 void top() {
		 if(head==null) {
			 System.out.println("Empty");
		 }else {
			 System.out.println(head.data);
		 }
	 }

	public static void main(String[] args) {
		StackLL st=new StackLL();
		st.push(new Node(3));
		st.push(new Node(4));
		st.push(new Node(2));
		st.push(new Node(1));
		st.display();
		st.pop();
		st.display();
		System.out.println("top");
		st.top();

	}

}

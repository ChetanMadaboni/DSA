package com.wiley.test1;

import javax.xml.soap.Node;

public class Test1 {
	Node head;
	static class Node{
		int key;
		Node next;
		Node(){
			
		}
		Node(int key){
			this.key=key;
		}
		Node(int key,Node next){
			this.key=key;
			this.next=next;
		}
	}
	static void insert(Test1 t1,int data) {
		Node node=new Node(data);
		if(t1.head==null) {
			t1.head=node;
		}else {
			Node cur=t1.head;
			while(cur.next!=null) {
				cur=cur.next;
			}
			cur.next=node;
		}
	}
	static void print(Node head) {
		Node cur=head;
		while(cur!=null) {
			System.out.println(cur.key);
			cur=cur.next;
		}
	}
	static void delete(Test1 t1,int res) {
		Node cur=t1.head;
		Node prev=null;
		while(cur!=null) {
			
			if(cur.key==res) {
				//System.out.println("entrd");
				break;
			}
			prev=cur;
			cur=cur.next;
		}
		prev.next=cur.next;
	}
	
	public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.insert(t1, 1);	
		t1.insert(t1, 2);
		t1.insert(t1, 3);
		t1.insert(t1, 4);
		t1.insert(t1,5);
		//print(t1.head);
		delete(t1,4);
		print(t1.head);

	}

}

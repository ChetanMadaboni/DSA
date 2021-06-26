package com.wiley.ll;



public class LinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data,Node next){
			this.data=data;
			this.next=next;
		}
	}
	public static LinkedList insert(LinkedList list,int data) {
		//Node currnode=list.head;
		Node newNode=new Node(data,null);
		if(list.head==null) {
			list.head=newNode;
		}else {
			Node cur=list.head;
			while(cur.next!=null) {
				cur=cur.next;
			}
			cur.next=newNode;
		}
		return list;
	}
	public static void print(LinkedList list) {
		Node node=list.head;
		while(node.next!=null) {
			System.out.print(node.data+"->");
			node=node.next;
		}
		System.out.println("null");
	}
	
	public static LinkedList delete(LinkedList list,int data) {
		Node node=new Node(data,null);
		Node prev=null;
		if(list.head.data==data) {
			list.head=list.head.next;
		}else {
			Node cur=list.head;
			while(cur.data!=data) {
				prev=cur;
				cur=cur.next;
			}
			prev.next=cur.next;
		}
		return list;
	}
	public static void main(String []args) {
		LinkedList list=new LinkedList();
		
		list=list.insert(list, 10);
		list=list.insert(list, 49);
		list=list.insert(list, 23);
		list=list.insert(list, 40);
		list=list.insert(list, 90);
		list=list.insert(list, 60);
		
		list.print(list);
		list.delete(list, 40);
		list.print(list);
	}
}

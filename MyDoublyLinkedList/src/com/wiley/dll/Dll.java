package com.wiley.dll;


public class Dll {
	Node head;
	Node tail;
	static class Node{
		int data;
		Node prev;
		Node next;
		Node(int data,Node prev,Node next){
			this.data=data;
			this.prev=prev;
			this.next=next;
		}
	}
	static Dll insert(Dll list,int data) {
		Node node=new Node(data,null,null);
		if(list.head==null) {
			list.head=node;
		}else {
			Node cur=list.head;
			while(cur.next!=null) {
				cur=cur.next;
			}
			node.prev=cur;
			cur.next=node;
		}
		return list;
	}
	static void print(Dll list) {
		Node node=list.head;
		while(node!=null) {
			System.out.print(node.data+"->");
			node=node.next;
		}
	}
	static void printRev(Dll list) {
		Node node=list.head;
		while(node!=null) {
			//System.out.print(node.data+"->");
			list.tail=node;
			node=node.next;
		}
		Node node1=list.tail;
		while(node1!=null) {
			System.out.print(node1.data+"->");
			node1=node1.prev;
		}
		
	}
	static Dll delete(Dll list,int data) {
		if(list.head.data==data) {
			list.head=list.head.next;
			list.head.prev=null;
		}
		else {
			Node node=list.head;
			Node prev=null;
			while(node.data!=data) {
				prev=node;
				node=node.next;
			}
			//prev.prev=;
			prev.next=node.next;
		}
		return list;
		
	}
	public static void main(String []args) {
		Dll list=new Dll();
		
		list=list.insert(list, 10);
		list=list.insert(list, 49);
		list=list.insert(list, 23);
		list=list.insert(list, 40);
		list=list.insert(list, 90);
		list=list.insert(list, 60);
		
		list.print(list);
		System.out.println();
		list.printRev(list);
		list.delete(list, 90);
		System.out.println();
		list.print(list);
	}
}

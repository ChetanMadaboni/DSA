package com.wiley.dll;



public class DoublyLinkedListImpli {
Node head;
Node tail;
	
	static class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data, Node next,Node prev) {
			super();
			this.data = data;
			this.next = next;
			this.prev=prev;
		}
		
		
	}
	public static DoublyLinkedListImpli insert(DoublyLinkedListImpli list,int data) {
		
		Node newNode=new Node(data,null,null);
//		newNode.next=null;
		//checking if link list is empty
		if(list.head==null && list.tail==null) {
			//make this node as first node
			newNode.prev=null;
			list.head=newNode;
			
		}
		else {
			Node last=list.head;
			while(last.next!=null)
				last=last.next;
			
			last.next=newNode;
		newNode.prev=last;
		}
		return list;
		
	}
	
	public static void traversal(DoublyLinkedListImpli list) {
		Node currentNode=list.head;
		while(currentNode!=null) {
			System.out.print(currentNode.data+" -> ");
			currentNode=currentNode.next;
		}
		System.out.println("null");
	}
	
	public static void traversalRev(DoublyLinkedListImpli list) {
		Node currentNode=list.tail;
		while(currentNode!=null) {
			System.out.print(currentNode.data+" -> ");
			currentNode=currentNode.prev;
		}
		System.out.println("null");
	}
	public static DoublyLinkedListImpli delete(DoublyLinkedListImpli list,int num) {
		Node currentNode=list.head;
		Node previous=null;
		if(currentNode.data==num) {
			list.head=currentNode.next;
			list.tail=null;
		}else {
			while(currentNode.data!=num) {
				previous=currentNode;
				currentNode=currentNode.next;
			}
			if(currentNode!=null) {
				previous.next=currentNode.next;
			}
		}
		return list;
}
	
	public static void main(String[] args) {
		DoublyLinkedListImpli list=new DoublyLinkedListImpli();
		
		list=list.insert(list, 10);
		list=list.insert(list, 49);
		list=list.insert(list, 23);
		list=list.insert(list, 40);
		list=list.insert(list, 90);
		list=list.insert(list, 60);
		
		list.traversal(list);
		list.delete(list, 10);
		list.traversal(list);
		list.delete(list, 40);
		list.traversal(list);
		list.traversalRev(list);
	}
}


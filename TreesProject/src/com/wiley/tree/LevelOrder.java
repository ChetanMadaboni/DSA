package com.wiley.tree;

import java.util.LinkedList;
import java.util.Queue;



public class LevelOrder {
	Node root;
	static class Node{
		int key;
		Node left;
		Node right;
		Node(){
			
		}
		Node(int key){
			this.key=key;
		}
		Node(int key,Node left,Node right){
			this.key=key;
			this.left=left;
			this.right=right;
		}
		
	}
	static void levelOrder(Node root) {
		System.out.println("entered");
		Queue<Node> qu=new LinkedList<>();//for storing the nodes
		qu.add(root);	
		while(!qu.isEmpty()) {
			int size=qu.size();
			while(size>0) {
				Node cur=qu.remove(); //poping the nodes and adding their children
				System.out.println(cur.key);
				if(cur.left!=null) {
					qu.add(cur.left);
				}
				if(cur.right!=null) {
					qu.add(cur.right);
				}
				--size;
			}
		}
	}
	
	public static void main(String[] args) {
		LevelOrder lo=new LevelOrder();
		lo.root=new Node(1);
		lo.root.left=new Node(2);
		lo.root.right=new Node(3);
		
		lo.root.left.left=new Node(4);
		lo.root.left.right=new Node(5);
		lo.root.right.left=new Node(6);
		lo.root.right.right=new Node(7);
		levelOrder(lo.root);
	}

}

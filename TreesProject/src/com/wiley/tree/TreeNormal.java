package com.wiley.tree;

import java.util.Iterator;
import java.util.Stack;

class Node{
	int key;
	Node left;
	Node right;
	public Node(int key){
		this.key=key;
	}
	Node(int key,Node left,Node right){
		this.left=left;
		this.key=key;
		this.right=right;
	}
	Node(){
		
	}
}
public class TreeNormal {
	Node root;
	static void InorderIter(Node root) {
		Stack<Integer> res=new Stack<Integer>();//fpr result
		Stack<Node> st=new Stack<Node>();//storing the Nodes into stack
		Node cur=root;
		while(true) {
			while(cur!=null) {
				st.push(cur);
				cur=cur.left;
			}
			if(st.isEmpty())
				break;
			cur=st.pop();
			res.add(cur.key);
			cur=cur.right;
		}
		Iterator<Integer> it=res.iterator();
		System.out.println("Inorder ");
		while(it.hasNext()) {
			//System.out.println("hi");
			System.out.print(it.next()+" ");
			
		}
	}
	static void preorderIter(Node root) {
		Stack<Integer> res=new Stack<Integer>();//fpr result
		Stack<Node> st=new Stack<Node>();//storing the Nodes into stack
		Node cur=root;
		while(true) {
			while(cur!=null) {
				res.add(cur.key);
				st.push(cur);
				cur=cur.left;
			}
			if(st.isEmpty())
				break;
			cur=st.pop();
			cur=cur.right;
		}
		Iterator<Integer> it=res.iterator();
		System.out.println("preorder ");
		while(it.hasNext()) {
			//System.out.println("hi");
			System.out.print(it.next()+" ");
			
		}
	}
	
	static void postorderIter(Node root) {
		Node cur=root;
		Node prev=null;
		Stack<Node> st=new Stack<Node>();
		Stack<Integer> res=new Stack<Integer>();
		while(true) {
			while(cur!=null) {
				st.add(cur);
				cur=cur.left;
			}
			if(st.isEmpty())
				break;
			while(cur==null && st.isEmpty()==false) {
				cur=st.peek();
				
				if(cur.right==null ||cur.right==prev) {
					res.add(cur.key);
					st.pop();
					prev=cur;
					cur=null;
				}else {
					cur=cur.right;
				}
			}
		}
		Iterator<Integer> it=res.iterator();
		System.out.println("post :");
		while(it.hasNext()) {
			//System.out.println("hi");
			System.out.print(it.next()+" ");
			
		}
		
	}

	public static void main(String[] args) {
		TreeNormal tr=new TreeNormal();
		Node left=new Node(2);
		Node right=new Node(3);
		Node root=new Node(1,left,right);
		left.left=new Node(4);
		left.right=new Node(5);
		right.left=new Node(6);
		right.right=new Node(7);
		//TreeNormal tr=new TreeNormal();
		InorderIter(root);
		preorderIter(root);
		postorderIter(root);
	}

}

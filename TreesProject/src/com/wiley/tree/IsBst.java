package com.wiley.tree;

public class IsBst {
	static class Node{
		int key;
		Node left;
		Node right;
		Node(){
			
		}
		Node(int key,Node left,Node right){
			this.key=key;
			this.left=left;
			this.right=right;
		}
		Node(int key){
			this.key=key;
		}
	}
	 boolean isBST(Node root,boolean flag,Node prev ) {
		if(root==null) {
			return true;
		}
		isBST(root.left,flag,prev);
		if(prev!=null && root.key<prev.key) {
			flag=false;
			return false;
		}
		prev=root;
		return isBST(root.right,flag,prev);
		
	}
	static void Bst(Node root){
		boolean flag=true;
		Node prev=null;
		IsBst is=new IsBst();
		//;
		if(is.isBST(root,flag,prev)) {
			System.out.println("is a binary tree");
		}else {
			System.out.println("not a binary tree");
		}
	}
	public static void main(String[] args) {
		Node root =new Node(9);
		root.left=new Node(5);
		root.right=new Node(11);
		root.left.left=new Node(3);
		root.left.right=new Node(7);
		root.right.left=new Node(10);
		root.right.right=new Node(12);
		Bst(root);
	}

}

package com.wiley.tree;

public class Tree {
	Node root;
	class Node{
		int key;
		Node left;
		Node right;
		Node(int key){
			this.key=key;
			
		}
	}
	void insertinto(int key) {
		root=insert(root,key);
	}
	Node insert(Node root,int key) {
		if(root==null) {
			root=new Node(key);
			return root;
		}
		else {
			if(key<root.key) {
				root.left=insert(root.left,key);
			}else {
				root.right=insert(root.right,key);
			}	
		}
	return root;
	}
	void inorder(Node root) {
		if(root!=null) {
			System.out.println(root.key);
			inorder(root.left);
			inorder(root.right);
			
		}
	}
	
	void delete(int key) {
		//Since we are deleting from elements recursively we are use an extra method
		root=deleteFrom(root,key);
	}
	Node deleteFrom(Node root,int key) {
		if(root==null) {
			return root;
		}else {
			if(key<root.key) {
				root.left=deleteFrom(root.left,key);
			}else if(key>root.key){
				root.right=deleteFrom(root.right,key);
			}else {
				//nodes having only 1 child
				if(root.left==null)
					return root.right;
				if(root.right==null)
					return root.left;
				
				//nodes having 2 childs
				root.key=helper(root.right);
				root.right=deleteFrom(root.right,root.key);
			}
		}
		return root;
	}
	int helper(Node node) {
		int prev=node.key;
		while(node.left!=null) {
			prev=node.left.key;
			node=node.left;
		}
		return prev;
	}
	public static void main(String []args) {
		Tree t=new Tree();
		t.insertinto(50);
		t.insertinto(20);
		t.insertinto(90);
		t.insertinto(10);
		t.insertinto(30);
		t.insertinto(70);
		t.insertinto(120);
		t.insertinto(40);
		t.inorder(t.root);
		t.delete(50);
		//t.inorder(t.root);
	}
}

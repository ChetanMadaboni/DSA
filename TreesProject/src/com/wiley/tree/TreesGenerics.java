package com.wiley.tree;


public class TreesGenerics<T extends Comparable<T>> {
	Node<T> root;
	class Node<T extends Comparable<T>>{
		T key;
		Node<T> left;
		Node<T> right;
		public Node(T key){
			this.key=key;
		}
	}
	void insertinto(T key) {
		root=insert(root,key);
	}
	Node<T> insert(Node<T> root,T key) {
		if(root==null) {
			root=new Node<T>(key);
			return root;
		}else {
			if(key.compareTo(root.key)<0) {
				root.left=insert(root.left,key);
			}	
			if(key.compareTo(root.key)>0) {
				root.right=insert(root.right,key);
	
			}
		}
		return root;
	}
		
	void inorder(Node<T> root) {
		if(root!=null) {
			inorder(root.left);
			System.out.println(root.key);
			inorder(root.right);
			
		}
	}
	
	void delete(T key) {
		//Since we are deleting from elements recursively we are use an extra method
		root=deleteFrom(root,key);
	}
	Node<T> deleteFrom(Node<T> root,T key) {
		if(root==null) {
			return root;
		}else {
			if(key.compareTo(root.key)<0) {
				root.left=deleteFrom(root.left,key);
			}else if(key.compareTo(root.key)>0){
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
	T helper(Node<T> node) {
		T prev=node.key;
		while(node.left!=null) {
			prev=node.left.key;
			node=node.left;
		}
		return prev;
	}
	public static void main(String []args) {
		TreesGenerics<Integer> t=new TreesGenerics<>();
		t.insertinto(50);
		t.insertinto(90);
		t.insertinto(70);
		t.insertinto(20);
		t.insertinto(10);
		t.insertinto(30);
		t.insertinto(120);
		t.insertinto(40);
		t.inorder(t.root);
		t.delete(50);
		t.inorder(t.root);
		TreesGenerics<String> t1=new TreesGenerics<String>();
		t1.insertinto("chetan");
		t1.insertinto("koushik");
		t1.insertinto("monkey");
		t1.inorder(t1.root);
	}
	
}

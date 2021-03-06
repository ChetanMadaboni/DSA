package com.wiley.graph;

import java.util.ArrayList;

public class GraphDemoLi {
	static class Node{
		 int vertex;
		int weight;
		public Node(int vertex,int weight){
			this.vertex=vertex;
			this.weight=weight;
		}
		public int getVertex() {
			return vertex;
		}
		public void setVertex(int vertex) {
			this.vertex = vertex;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		
	}
	
	 static void print(ArrayList<ArrayList<Node>> arr) {
		 for(int i=0;i<arr.size();i++) {
			 ArrayList<Node> iarr=arr.get(i);
			 for(int j=0;j<iarr.size();j++) {
				 Node node=iarr.get(j);
				 System.out.println(i+" -> "+node.vertex+" -> "+node.weight);
			 }
		 }
	 }
	 
	 static void prims(ArrayList<ArrayList<Node>> adjlist,int n) {
		 int []key=new int[n];
		 int parent[]=new int[n];
		 boolean []visited=new  boolean[n];
		 for(int i=0;i<n;i++) {
			 visited[i]=false;
			 parent[i]=-1;
			 key[i]=1000000;
		 }
		 key[0]=0;
		 for(int i=0;i<n-1;i++){
			 int u=0,mini=1000000;
			 for(int v=0;v<n;v++) {
				 if(visited[v]==false && key[v]<mini) {
					 mini=key[v];
					 u=v;
				 }
			 }
			 visited[u]=true;
			 for(Node node:adjlist.get(u)) {
				 if(visited[node.getVertex()]==false && node.getWeight()<key[node.getVertex()]) {
					 parent[node.getVertex()]=u;
					 key[node.getVertex()]=node.getWeight();
				 }
			 } 
			 
		 }
		 for(int i=0;i<parent.length;i++) {
			 System.out.print(key[i]+" ");
		 }
	 }
	public static void main(String []args) {
		GraphDemoLi gr=new GraphDemoLi();
		ArrayList<ArrayList<Node>> arr=new ArrayList<ArrayList<Node>>();
		int vertices=5;
		
		for(int i=0;i<vertices;i++) {
			arr.add(new ArrayList<Node>());
		}
		System.out.println(arr.toString());
		arr.get(0).add(new Node(1,2));
		arr.get(1).add(new Node(0,2));
		arr.get(0).add(new Node(3,6));
		arr.get(3).add(new Node(0,6));
		arr.get(1).add(new Node(2,3));
		arr.get(2).add(new Node(1,3));
		arr.get(1).add(new Node(3,8));
		arr.get(3).add(new Node(1,8));
		arr.get(1).add(new Node(4,5));
		arr.get(4).add(new Node(1,5));
		arr.get(2).add(new Node(4,7));
		arr.get(4).add(new Node(2,7));
		print(arr);
		prims(arr,vertices);
		}
}

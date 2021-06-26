package com.wiley.graph;

import java.util.LinkedList;

public class graphdemo {
	int vertices;
	static class Edge{
		int source;
		int destination;
		Edge(int source,int destination){
			this.source=source;
			this.destination=destination;
		}
	} 
	
	 LinkedList<Edge> [] adjacencylist;
	void addVertex(int vertices) {
		this.vertices=vertices;
		adjacencylist=new LinkedList[vertices];
		for(int i=0;i<vertices;i++) {
			adjacencylist[i]=new LinkedList<>();
		}
	}
	
	void addEdge(int source,int destination,boolean bidirectional) {
		Edge ed=new Edge(source,destination);
		if(bidirectional==true) {
			adjacencylist[destination].add(ed);
		}else {
			adjacencylist[source].add(ed);
		}
		
	}
	
	void printlist(){
		for(int j=0;j<vertices;j++) {
			LinkedList<Edge> list=adjacencylist[j];
			for(int k=0;k<list.size();k++) {
				System.out.println(k+"->"+list.get(k).destination);
			}
		}
	}
	public static void main(String[] args) {
		graphdemo gd=new graphdemo();
		gd.addVertex(5);
		gd.addEdge(0, 1, false);
		gd.addEdge(0, 2, false);
		gd.addEdge(1, 2, false);
		gd.addEdge(1, 3, false);
		gd.addEdge(1, 4, false);
		gd.addEdge(2, 3, false);
		gd.addEdge(4, 5, false);
		gd.printlist();
	}

}

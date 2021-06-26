package com.wiley.graph;

import java.util.LinkedList;

public class GraphWtDemo {
	private int vertices;
	static class Edge{
		int source;
		int destination;
		int weight;
		Edge(){
			
		}
		Edge(int source,int destination){
			this.source=source;
			this.destination=destination;
					
		}
		Edge(int source,int destination,int weight){
			this.source=source;
			this.destination=destination;
			this.weight=weight;
		}
	}
	
	private LinkedList<Edge> []adjacencylist;
	void addVertex(int vertices) {
		this.vertices=vertices;
		adjacencylist=new LinkedList[vertices];
		for(int i=0;i<vertices;i++) {
		 adjacencylist[i]=new LinkedList<>();
		}
	}
	
	void addEdge(int source,int destination,int weight) {
		Edge ed=new Edge(source,destination,weight);
		adjacencylist[source].add(ed);
	}
	void print() {
		for(int i=0;i<vertices;i++) {
			LinkedList<Edge> list=adjacencylist[i];
			for(int j=0;j<list.size();j++) {
				System.out.println(i+"->"+list.get(j).destination+"->"+list.get(j).weight);
			}
		}
	}
	public static void main(String[] args) {
		GraphWtDemo gwt=new GraphWtDemo();
		gwt.addVertex(5);
		gwt.addEdge(0,1,1);
		gwt.addEdge(0,2,2);
		gwt.addEdge(1,2,4);
		gwt.addEdge(1,3,5);
		gwt.addEdge(1,4,7);
		gwt.addEdge(2,3,3);
		gwt.addEdge(3,4,6);
		gwt.print();

	}

}

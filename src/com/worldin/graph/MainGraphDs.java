package com.worldin.graph;

public class MainGraphDs {
	
	public static void main(String[] args) {
		
		GraphDS graph= new GraphDS();
		
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		
		graph.addEdges("A", "B");
		graph.addEdges("C", "A");
		graph.addEdges("D", "B");
		graph.addEdges("D", "C");
		graph.addEdges("D", "A");
		
		
		graph.printGraph();
		
		graph.removeEdges("A", "D");
		
		graph.printGraph();
		
		graph.removeVertex("D");
		
		graph.printGraph();
		
	}

}

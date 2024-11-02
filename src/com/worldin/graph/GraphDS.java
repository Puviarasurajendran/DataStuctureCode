package com.worldin.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class GraphDS {
	
	HashMap<String, ArrayList<String>> adjList;
	
	public GraphDS(){
		adjList= new HashMap<String, ArrayList<String>>();
	}
	
	public boolean addVertex(String vertex) {
		if(!adjList.containsKey(vertex)) {
			adjList.put(vertex, new ArrayList<String>());
			return true;
		}
		return false;
	}
	
	public boolean addEdges(String vertex1,String vertex2) {
		if(adjList.containsKey(vertex1)&&adjList.containsKey(vertex2)) {
			adjList.get(vertex2).add(vertex1);
			adjList.get(vertex1).add(vertex2);
			return true;
		}
		return false;
	}
	
	public boolean removeEdges(String vertex1,String vertex2) {
		if(adjList.containsKey(vertex1)&&adjList.containsKey(vertex2)) {
			adjList.get(vertex2).remove(vertex1);
			adjList.get(vertex1).remove(vertex2);
			return true;
		}
		return false;
	}
	
	public boolean removeVertex(String vertex) {
		if(!adjList.containsKey(vertex)) {
			return false;
		}
		for (String s: adjList.get(vertex)) {
			  adjList.get(s).remove(vertex);
		}
		System.out.println(adjList.remove(vertex));
		return true;
	}
	
	public void printGraph() {
		System.out.println(adjList);
	}

}

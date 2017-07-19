package com.ishaank.learn.algoproblemsolution;

import java.util.*;


class Vertex {
	
	int label  ; 
	boolean wasVisited ;
	
	public Vertex ( int lab) {
		label = lab;
		wasVisited = false;
	}	
	
}

public class BFSShortestReachInAGraph {	 
	

	
	
	public static class Graph {
		
		public int size_max;
		public int[][] adjMat ;
		public Vertex[] listVertex ;
		//private int nVerts ;
    
    
    public Graph(int size) {
        
    	size_max = size;
    	listVertex = new Vertex[size];
    	adjMat = new int[size][size];
    	//nVerts =0;
    	for (int i = 0 ; i < size ; i++){
    		for (int j = 0 ; j < size ; j++){
    			adjMat[i][j] =0;  
    		}}
    	
    	for (int i=0;i<size_max;i++) 
    		listVertex[i] = new Vertex(i);
    		       
    	
    }

    public void addEdge(int first, int second) {
    	adjMat[first][second] =1;
    	adjMat[second][first]  =1;
    }
    
    public int getAdjNode (int node) {
    	
    	for(int i =0 ; i < size_max ;i++)
    		if(adjMat[i][node] == 1 && listVertex[i].wasVisited == false	)
    			return i;
		return -1;
    	
    }
    
    public int[] shortestReach(int startId) { // 0 indexed
    	

    	
    	Queue<Integer> queue = new LinkedList<Integer>();
    	queue.add(startId);
    	int distance = 0;
    	int[] ans = new int[size_max];
    	for(int i = 0; i < size_max ; i++)
    		ans[i] = -1;
    	listVertex[startId].wasVisited = true;
    	ans[startId] =0;
    	
    	while (!queue.isEmpty())  {
    		
    		//distance += 6 ;
    		int currentnode = queue.poll();
    		//System.out.println("Evauating for main node " + currentnode) ;
    		while(getAdjNode(currentnode) > -1 ) {
    			int adjnode = getAdjNode(currentnode);
    			//System.out.println("For " + currentnode + " done for " + adjnode +" distance is " + distance);
    			listVertex[adjnode].wasVisited = true;
    			ans[listVertex[adjnode].label] = ans[currentnode] + 6;
    			queue.add(adjnode);
    		}
    		
    	}
    	
    	for(int i = 0 ; i < size_max ; i ++) 
    		listVertex[i].wasVisited = false;
        
    	return ans;
    }
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  
    int queries = scanner.nextInt();
    
    for (int t = 0; t < queries; t++) {
        
        // Create a graph of size n where each edge weight is 6:
        Graph graph = new Graph(scanner.nextInt());
        
        
        int m = scanner.nextInt();
        
        // read and set edges
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            
            // add each edge to the graph
            graph.addEdge(u, v);
        }
        
        // Find shortest reach from node s
        int startId = scanner.nextInt() - 1;
        int[] distances = graph.shortestReach(startId);

        for (int i = 0; i < distances.length; i++) {
            if (i != startId) {
                System.out.print(distances[i]);
                System.out.print(" ");
            }
        }
        System.out.println();            
    }
    
    scanner.close();
}
}

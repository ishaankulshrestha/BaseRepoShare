package com.ishaank.learn.coredatastructureandcollections;
import java.util.*;



class Vertex { 
	public char label;
	public boolean wasVisited ;
	
	public Vertex(char lab) {
		label = lab ;
		wasVisited = false;
	}
}

public class Graphs {
	
	private final int MAX_VERTEX = 20;
	private Vertex[] vertexList;
	private int adjMat[][];
	public int nVerts;
	


public Graphs() {
	vertexList = new Vertex[MAX_VERTEX];
	adjMat = new int[MAX_VERTEX][MAX_VERTEX];
	nVerts = 0;
	for (int i =0 ; i < MAX_VERTEX ; i++)
		for ( int j = 0; j < MAX_VERTEX ; j++)
			adjMat[i][j] = 0;
	/*for (int i =0 ; i < MAX_VERTEX ; i++) {
		vertexList[i].label ='z';
	}*/
	}

public void addVertex(char lab)  {
		vertexList[nVerts++] = new Vertex(lab);
		
}

public void addEdge (int start, int end){
	adjMat[start][end] = 1;
	adjMat[end][start]  = 1;
}

public void displayVertex(int v ) {
	System.out.print(vertexList[v].label);
}

public int getAdjUnvisitedVertex(int v) {
	for (int j = 0 ; j < MAX_VERTEX ; j++) {
	if(adjMat[v][j]==1 && !(vertexList[j].wasVisited)) {
		return j;
	}
	}
	return -1;

}

public void dfs()
{
	Stack<Integer> theStack = new Stack<Integer>();
	vertexList[0].wasVisited = true;
	displayVertex(0);
	theStack.push(0);
	
	while(!theStack.isEmpty()) {
		int v = getAdjUnvisitedVertex(theStack.peek()) ;
		if(v==-1)
			theStack.pop();
		else
		{
			vertexList[v].wasVisited = true;
			//System.out.println("join " + v + "and " + theStack.peek());
			
			displayVertex(v);
			theStack.push(v);
		}
	}
	
	for(int i = 0; i < nVerts ; i++)
		vertexList[i].wasVisited = false;
	
}

public void mst()
{
	Stack<Integer> theStack = new Stack<Integer>();
	vertexList[0].wasVisited = true;
	//displayVertex(0);
	theStack.push(0);
	
	while(!theStack.isEmpty()) {
		int v = getAdjUnvisitedVertex(theStack.peek()) ;
		if(v==-1)
			theStack.pop();
		else
		{
			vertexList[v].wasVisited = true;
			System.out.println("join " + v + " and " + theStack.peek());
			
			//displayVertex(v);
			theStack.push(v);
		}
	}
	
	for(int i = 0; i < nVerts ; i++)
		vertexList[i].wasVisited = false;
	
}


public void bfs()
{
	Queue<Integer> theQueue = new LinkedList<Integer>();
	vertexList[0].wasVisited = true;
	displayVertex(0);
	theQueue.add(0);
	int v2;
	
	while(!theQueue.isEmpty()) {
		int v1 = theQueue.remove();
		v2=getAdjUnvisitedVertex(v1);
		while ( v2 != -1) {
			vertexList[v2].wasVisited = true;
			displayVertex(v2);
			theQueue.add(v2);
			v2=getAdjUnvisitedVertex(v1);
		}		
	}
	
	for(int i = 0; i < nVerts ; i++)
		vertexList[i].wasVisited = false;
	
}

public static void main (String[] args) {
		Graphs theGraph = new Graphs();
		theGraph.addVertex('A');
		theGraph.addVertex('B');
		theGraph.addVertex('C');
		theGraph.addVertex('D');
		theGraph.addVertex('E');
		
		theGraph.addEdge(0, 1);
		theGraph.addEdge(1, 2);
		theGraph.addEdge(0, 3);
		theGraph.addEdge(3, 4);
		//theGraph.addEdge(3, 2);
		//theGraph.addEdge(4, 2);
		
		System.out.println("Visits : " );
			theGraph.dfs();
			System.out.println("\n");
			theGraph.bfs();
			System.out.println("\n");
			theGraph.mst();
		System.out.println();
}


}



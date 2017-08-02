package com.ishaank.learn.algoproblemsolution;
import java.util.*;

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");

	class Solution {
		int total_stops = 0,last =0;
		Queue<Integer> pq = new PriorityQueue<Integer>();
	    public int solution(int[] A, int[] B, int M, int X, int Y) {
			
	        // write your code in Java SE 8
			for (int i =0 ; i < A.length ;) {
				int weight = 0 , person = 0 ; 
				
				
				
				do {
					weight += A[i];
					person++;
					pq.add(B[i]);
					i++;
					if(i>=A.length)
						break;
				}
				while ((weight + A[i] <= Y) && person + 1 <= X ) ;
				total_stops++;
				while(!pq.isEmpty()){
					if(last != pq.peek())
						total_stops++;
					last = pq.poll();
				}
					
		}
			
			return total_stops;
	    }
	    
	    public static void main(String[] args) {
	    	int[] A = {40,40,100,80,20};
	    	int[] B = {3,3,2,2,3};
	    	int X =2, Y= 200, M=5	;
	    	Solution cls = new Solution();
	    	int result = cls.solution(A,B,M,X,Y);
	    	System.out.println(result);
	    }
	}
	
	


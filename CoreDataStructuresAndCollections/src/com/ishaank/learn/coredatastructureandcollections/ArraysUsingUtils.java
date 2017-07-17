package com.ishaank.learn.coredatastructureandcollections;

import java.util.*;

public class ArraysUsingUtils {
	
	public static void main(String[] args) {
	
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    int[][] arr = new int[N][3];
    
    
    for (int i = 0 ; i < N ; i++ ) {
        for (int j = 0 ; j < 3 ; j++)
        arr[i][j] = s.nextInt();
    }
    s.close();
    
    double max = arr[0][2], distance =0;
    int currx = arr[0][0] , curry = arr[0][1];
    for (int i = 1 ; i < N ; i++) {
        distance = Math.sqrt((Math.pow((double)currx - (double)arr[i][0],2) 
        + Math.pow((double)curry - (double)arr[i][1],2)));
        //if ((double)arr[i][2] >= distance) {
            max += ((double)arr[i][2] - distance);
            currx = arr[i][0];
            curry = arr[i][1];
        //}
         
    }
    
System.out.println((float)Math.round(max*1000000)/1000000);
}
}




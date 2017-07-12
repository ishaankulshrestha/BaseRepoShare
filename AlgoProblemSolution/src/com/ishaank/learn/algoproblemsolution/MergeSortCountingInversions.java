package com.ishaank.learn.algoproblemsolution;

import java.util.*;

public class MergeSortCountingInversions {
	
public static long countInversions(int[] arr){
        
    	long count =0;
    	float[] sort_arr = new float[arr.length];
    	for(int i = 0; i < arr.length; i++) 
    		sort_arr[i] = (long)arr[i];
    	Arrays.sort(sort_arr);   	
        for(int i = 0 ; i < arr.length ; i++)  {
            
            int at_position = Arrays.binarySearch(sort_arr, arr[i]);
            System.out.println("at_position = " + at_position + " i = " + i);
            System.out.println(Arrays.toString(sort_arr));
            System.out.println(Arrays.toString(arr));
        	count += Math.abs(i-at_position) ;
            arr[i] = -999;
            if (at_position > 0)
            sort_arr[at_position] = -999;
        }
        return count;
        	
    
    }

  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int arr_i=0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            System.out.println(countInversions(arr));
        }
        in.close();
    }
    
    
}

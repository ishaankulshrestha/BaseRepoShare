package com.ishaank.learn.algoproblemsolution;

import java.util.*;

public class BinarySearchIceCreamParlor {
	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            int m = in.nextInt();
	            int n = in.nextInt();
	            int position =0,i=0;
	            int a[] = new int[n];
	            for(int a_i=0; a_i < n; a_i++){
	                a[a_i] = in.nextInt();
	            }
	            int[] b = new int[n];
	            b = Arrays.copyOf(a, n);
	            Arrays.sort(b);
	            //System.out.println(Arrays.toString(b));
	            for(i = 0; i < n ; i++)
	            {
	            	position = Arrays.binarySearch(b, m-b[i]);
	            	if(position > 0) {
	            		//System.out.println("Found Solution " + a[i] + " + " + );
	            		break;
	            	}
	            		
	            }
	            for (int j = 0; j<n;j++) {
	            	if(a[j] == b[i] || a[j] == b[position]) 
	            		System.out.print((j+1) + " ");
	            	
	            	
	            }
              System.out.println("");
	            
	        }
	        in.close();
	        
	    }
	}

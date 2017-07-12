package com.ishaank.learn.algoproblemsolution;
import java.util.*;

public class RecursionDavisStaircase {
	
	static int[] arr = new int[37];

	   public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        arr[1] = 1;arr[2] =2 ; arr[3] = 4;
	        for(int a0 = 0; a0 < s; a0++){
	            int n = in.nextInt();
	            System.out.println(findsteps(n));
	        }
	        	
	        
	        in.close();
	    }

		private static int findsteps(int n) {
			// TODO Auto-generated method stub
			if(arr[n]>0)
				return arr[n];
			arr[n] = findsteps(n-3) + findsteps(n-2) + findsteps(n-1);

			return arr[n];
		}
	}
package com.ishaank.learn.algoproblemsolution;

import java.util.*;

public class TimeComplexityPrimality {
	   public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int p = in.nextInt();
	        for(int a0 = 0; a0 < p; a0++){
	            int n = in.nextInt();
	            int range = n/2;
	            boolean flag = true;
	            for (int i = 2; i <= range ; i++) {
	            	if(n%i==0) {
	            		flag = false;
	            		break;
	            	}
	            	range = n/i;
	            }
	            System.out.println((flag && n!=1) ? "Prime" : "Not prime");
	            
	        }
	        in.close();
	    }
	}
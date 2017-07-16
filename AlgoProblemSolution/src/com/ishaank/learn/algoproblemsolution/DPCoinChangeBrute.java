package com.ishaank.learn.algoproblemsolution;

import java.util.Arrays;
import java.util.Scanner;

public class DPCoinChangeBrute {
	
	static int[] arr = new int[50];
	
    public static long makeChange(int[] coins, int money) {
    	
    	return -1;
    	
    	

    	
    	
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }
        Arrays.sort(coins);	
        System.out.println(makeChange(coins, n));
        in.close();
    }
}

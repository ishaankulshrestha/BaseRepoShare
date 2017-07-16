package com.ishaank.learn.algoproblemsolution;

import java.util.*;



public class DPCoinChange {
	
	static int[] arr = new int[50];
	
    public static long makeChange(int[] coins, int money) {
    	
    	
    	if(coins[0]==money || 2*coins[0] ==money)
    		return 1;
    	if(coins[0] > money)
    		return 0;
    	int sum =0;
    	for(int i : coins)
    		if(money == i) {
    			sum++;
    			break;
    		}
    
    	 long newadd = makeChange(coins,(money-coins[0]));
    	 if (newadd > 0) 
    		 sum += 1+ newadd ;
    	
    	return sum;
    }
    
 /*   private static int findsteps(int n) {
		// TODO Auto-generated method stub
		if(arr[n]>0)
			return arr[n];
		arr[n] = findsteps(n-3) + findsteps(n-2) + findsteps(n-1);

		return arr[n];
	}*/
    
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

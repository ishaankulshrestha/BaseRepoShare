package com.ishaank.learn.algoproblemsolution;

import java.util.*;

/*
 * public static int lonelyInteger(int[] a) {
    int value = 0;

    for (int i : a) {
    //XOR will cancel all duplicate values to zero and 
    //in the end only number will be there
        value ^= i;
    }
    return value;
}
 */



public class BitManipulationLonelyInteger {
    public static int lonelyInteger(int[] a) {
        if(a.length == 1)
            return a[0];
        Arrays.sort(a);
        if(a[0]!=a[1])
            return(a[0]);
        if(a[a.length-1]!=a[a.length-2])
            return(a[a.length-1]);
        for ( int i = 1 ; i < a.length - 1 ; i++) {
            if (a[i]==a[i-1] || a[i] == a[i+1])
                continue;
            return a[i];
        }
        return -1;
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        in.close();
        System.out.println(lonelyInteger(a));
    }
}

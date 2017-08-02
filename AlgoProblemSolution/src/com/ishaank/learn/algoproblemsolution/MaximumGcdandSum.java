package com.ishaank.learn.algoproblemsolution;

import java.util.*;

public class MaximumGcdandSum {



    static int maximumGcdAndSum(int[] A, int[] B) {
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        //int gcd_curr=0,gcd_max=0,ele_a = A[0],ele_b=B[0];
        int ele_max_div;
        ele_max_div = A[A.length -1] > B[B.length -1 ] ? B[B.length -1 ] : A[A.length -1];
        int i =0, j = 0 ; 
        
        for (int div_curr = ele_max_div; div_curr > 0 ;div_curr--)
        {
        	for (i = A.length -1 ; i >= 0 ; i-- ) {
        		if(A[i] < div_curr ) {
        			i = -1;
        			break;
        		}
        		if (A[i]%div_curr == 0)
        			break;
        	}
        	
        	
        	for (j = B.length -1 ; j >= 0 ; j-- ) {
        		if(B[j] < div_curr ) {
        			j = -1;
        			break;
        		}
        		if (B[j]%div_curr == 0)
        			break;
        	}
        	
        	if (i > -1 && j > -1)
        		return A[i]+B[j];
        	
        //	div_curr = div_curr;
        	

        	
        	
        }
        
        return 1;
        
        
        
        
        
      /*  for (int i = A.length -1; i >= 0 ; i--)
        {
        	if ( A[i] <= gcd_max)
        		break;
            for (int j = B.length -1; j >= 0 ;  j--)
            {
            	if ( B[j] <= gcd_max)
            		break;
                gcd_curr = gcd(A[i],B[j]);
                if(gcd_curr > gcd_max || (gcd_curr == gcd_max && ele_a + ele_b < A[i] +B[j]))
                   {
                       gcd_max = gcd_curr;
                       ele_a = A[i];
                       ele_b = B[j];
                   }
            }
        }
        return ele_a + ele_b; */
        // Complete this function
    }
    
  /*  static int gcd (int a, int b)
    {
        int c = a>b? b : a ;
        for (int i = c ; i >0  ; i--)
            if (a%i == 0 && b%i == 0)
                return i;       
        return 1;
    }*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for(int A_i = 0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int[] B = new int[n];
        for(int B_i = 0; B_i < n; B_i++){
            B[B_i] = in.nextInt();
        }
        in.close();
        int res = maximumGcdAndSum(A, B);
        System.out.println(res);
    }
}
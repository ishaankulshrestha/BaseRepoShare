package com.ishaank.learn.statistics;

/* Developed by Ishaan Kulshrestha so as to demo how to calculate mean mode and median using java8. 
 * Snippet is free for use for anywhere with or without any modification.
 * 
 */

import java.util.*;

public class MeanModeMedian {
	
    public static void main(String[] args) {
    	
    	// Reading input from command line where first number will tell number of elements and then after it will give
    	// complete set of elements. Input is being taken by standard Scanner. Sample input file can be find attached below the code
        
        Scanner in = new Scanner(System.in);
        
        // Scanning first line for total number of element
        int total_num = in.nextInt();
        
        // defining array with total length as total number of element
        int[] arr = new int[total_num]; 
        int  mode = 0 , max_count = 0 , current_count = 0 ;
        float mean = 0, median = 0,sum = 0;
        
        //Looping through so as to read all values
        for (int counter = 0 ; counter < total_num ; counter ++) {
            arr[counter] = in.nextInt();
            sum += arr[counter];
        }
        in.close();
        
        //Sorting Array with quick sort(internal using utils)
        Arrays.sort(arr);
        
        //Figuring out mode by following logic. 
        //In case if frequency of more than one element is equal and highest then smallest one will be chosen.
        for (int counter =0; counter < total_num ; counter++){
            if (counter == 0){
                mode = arr[counter];
                max_count = 1;
                current_count = 1;
                continue;
            }
            if (arr[counter] == arr[counter - 1])
                current_count++;
            else
                current_count =1 ;
             if (current_count > max_count) {
            	 max_count = current_count;
                 mode = arr[counter];
             }
       }
        
        //Evaluating all required values with round to one place of decimal where ever applicable;
        mean = (float)sum/total_num;
        mean = (float)Math.round(mean*10)/10;
        
        //Figuring out median depending on total number of elements are even or odd. Note at this time array is already sorted.
        median = (total_num%2 != 0 ? (float)arr[(total_num-1)/2] : (float)(arr[(total_num/2)] + arr[total_num/2 -1])/2);
        median = (float)Math.round(median*10)/10;
        
        //Finally printing out result as mean, median and mode.
        System.out.println(mean + "\n" + median + "\n" + mode);
        
        //End of main function.
               
    }
}
package com.ishaank.learn.algoproblemsolution;
import java.util.*;

public class DFSConnectedCellinaGrid {
	
    public static int getBiggestRegion(int[][] matrix) {
    	
    	int current_sum = 0 , max_sum =0;
    	
    	for (int i = 0 ; i < matrix.length ; i++) {
    		for (int j = 0 ; j < matrix[0].length ; j ++)
    		{
    			current_sum = findregionsum(matrix, i, j);
    			if(current_sum > max_sum)
    				max_sum = current_sum;
    		}
    	}
    	
    	
    	return max_sum;
        
    }
    public static int findregionsum(int[][] matrix, int r , int c)
    {
    	if(r>(matrix.length-1) || c>(matrix[0].length-1))
    		return 0;
    	if(r<0 || c < 0)
    		return 0;
    	if(matrix[r][c] == 0)
    		return 0;
    	int sum = 1;
    	matrix[r][c] = 0 ;
    	sum += findregionsum(matrix,r+1,c);
    	sum += findregionsum(matrix,r+1,c+1);
    	sum += findregionsum(matrix,r,c+1);
    	sum += findregionsum(matrix,r-1,c);
    	sum += findregionsum(matrix,r-1,c-1);
    	sum += findregionsum(matrix,r,c-1);
    	sum += findregionsum(matrix,r+1,c-1);
    	sum += findregionsum(matrix,r-1,c+1);
    	return sum;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        in.close();
        System.out.println(getBiggestRegion(grid));
        
    }
}

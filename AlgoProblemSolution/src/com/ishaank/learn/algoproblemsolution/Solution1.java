package com.ishaank.learn.algoproblemsolution;

public class Solution1 {

	String solution (int N, String S, String T){
		
		String Sw[] = S.split(","),Tw[] = T.split(" ");
		String Sww[][] = new String[Sw.length][2];
		int[][] arr = new int[N][N];
		for(int i = 0 ; i < Sw.length ; i++) {
			Sww[i][0] = Sw[i].split(" ")[0];
			Sww[i][1] = Sw[i].split(" ")[1];
			//System.out.println(Sww[i][0].charAt(1)+ " XXXX " + Sww[i][1]);
		}
		
		for(int i=0;i<N;i++){
			for(int j = 0 ; j < N ; j++){
				arr[i][j]=0;
			}
		}
		
		for(int i =0 ; i<Tw.length ;i++){
			
			//System.out.println((int)Tw[i].charAt(1)- (int)'A');
			if((int)Tw[i].charAt(1) >= (int)'A' && (int)Tw[i].charAt(1) <= (int)'Z' )
				System.out.println((int)Tw[i].charAt(1)- (int)'A');
			//arr[Tw[i].charAt(0)][(int)Tw[i].charAt(1) - (int)'A'] = 1;
		}
		
		
		for(int i=0;i<N;i++){
			for(int j = 0 ; j < N ; j++){
				//System.out.print(arr[i][j]);
			}
			//System.out.println("");
		}
		
		
		return null;
	}
	
	public static void main(String[] args){
		
		int N = 4;
		String S = "1B 2C,2D 4D", T = "2B 2D 3D 4D 4A";
		Solution1 obj = new Solution1();
		String ans = obj.solution(N, S, T);
		System.out.println(ans);
		
	}
	
}

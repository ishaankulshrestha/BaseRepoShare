package com.ishaank.learn.usingcollectionandgenerics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class UsingComparatorDemo {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
	
	class Player{
	    String name;
	    int score;
	    
	    Player(String name, int score){
	        this.name = name;
	        this.score = score;
	    }
	}
	
	class Checker implements Comparator<Object>{
	    
	    @Override
		public int compare(Object arg0, Object arg1) {
			// TODO Auto-generated method stub
	        
	        Player P1 = (Player)arg0;
	        Player P2 = (Player)arg1;
	        
	        if (P1.score == P2.score) 
	        	return(P1.name.compareTo(P2.name));
	       
	        else if (P1.score > P2.score)
	            return -1;
	        else 
	            return 1;
	        
	        
		}  
	        
	    
	}

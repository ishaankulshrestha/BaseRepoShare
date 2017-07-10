package com.ishaank.learn.usingcollectionandgenerics;

// importing java.utils
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class UsingComparatorDemo {
	
	public static void main(String[] args) {
		
		//Setting up scanner to read values
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        //Making array of player class
        Player[] player = new Player[n];
        
        //Instantiating class implementing comparator
        Checker checker = new Checker();
        
        //Reading data from scanner object
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
        
        //Sorting on based of comparator so defined in other class
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
	
	//Defining class
	class Player{
	    String name;
	    int score;
	    
	    Player(String name, int score){
	        this.name = name;
	        this.score = score;
	    }
	}
	
	
	//Defining class implementing comparator 
	class Checker implements Comparator<Object>{
	    
	    @Override
		public int compare(Object arg0, Object arg1) {
			// TODO Auto-generated method stub
	        
	        Player P1 = (Player)arg0;
	        Player P2 = (Player)arg1;
	        
	        //In case if score is same then decide lexicographically
	        if (P1.score == P2.score) 
	        	return(P1.name.compareTo(P2.name));
	       
	        else if (P1.score > P2.score)
	            return -1;
	        else 
	            return 1;	        
	        
		}  
	        
	    
	}

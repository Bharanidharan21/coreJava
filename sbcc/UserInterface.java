package com.Bharani.sbcc;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		Player player=null;
		
		while(true) {
		System.out.println("1.Creat Player");
		System.out.println("2.Displayl Player Details");
		System.out.println("3.Exit");
		System.out.println("Enter your choice");
		 choice=sc.nextInt();
		if(choice==1) {
			System.out.println("Enter the player Id: ");
			sc.nextLine();
	    	String playerId=sc.nextLine();
	    	
	    	System.out.println("Enter the player name: ");
	    
	    	
	    	String playerName=sc.nextLine();
	    	System.out.println("Enter the number of matches played :");
	        int matchesPlayed=sc.nextInt();
	    	System.out.println("Enter the total runs scored:  ");
	    	int runScored=sc.nextInt();
	     	System.out.println("Enter the playing zone : ");
	     	sc.nextLine();
	    	String playingZone=sc.nextLine();
	
	        player = new Player(playerId, playerName, matchesPlayed, runScored, playingZone);			
		}
		else if(choice==3) {
			System.out.println("Thankyou for using SBCC application ");
			return;
		}
		else if(choice==2) {
			if(player!=null) {
				System.out.println("playerId:"+player.getPlayerId());
				System.out.println("player name:"+player.getPlayerName());
				System.out.println("player match played:"+player.getMatchesPlayed());
				System.out.println("player run scored:"+player.getRunScored());
				System.out.println("player playing zone:"+player.getPlayingZone());
			}
			else {
				System.out.println("player not created");
			}
		}
		}
	}

}

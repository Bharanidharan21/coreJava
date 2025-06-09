package com.Bharani.sbcc2;
import java.util.Scanner;

public class UserInterface {
	 	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		Player player = null;
		while (true) {
			System.out.println("1. Parse the player details and create player ");
			System.out.println("2. Display Player Details");
			System.out.println("3. Exit");
			choice = Integer.parseInt(sc.nextLine());
			if (choice == 3)
			{
				System.out.println("Thank for using SBCC application");
				return;
			}
			else if (choice == 1)
			{
				System.out.println("Enter the player details");
				String[] playerDetails = sc.nextLine().split(":");
				
				String playerId = playerDetails[0];
				
				String playerName = playerDetails[1];
				
				int matchesPlayed= Integer.parseInt(playerDetails[2]);
				
				
				String[] runs = new String[matchesPlayed];
				
				int j=0,i=0;
				
				for(i=0,j=3;i<matchesPlayed;i++,j++)
				{
					runs[i]=playerDetails[j];
				}
				
				int runScored = 0;
				
				String playingZone=playerDetails[j];
				
				player=	new Player(playerId, playerName, matchesPlayed, runScored, playingZone);
			
				player.setRunScored(player.calculateTotalRuns(runs));
				
			}
			
			else if(choice==2)
			{
				if(player!=null)
				{
					System.out.println("Player Id:"+player.getPlayerId());
					System.out.println("Player Name:"+player.getPlayerName());
					System.out.println("Player Match Played:"+player.getMatchesPlayed());
					System.out.println("Player Run Scored:"+player.getRunScored());
					System.out.println("Player Playing Zone:"+player.getPlayingZone());
				}
				else 
				{
					System.out.println("Player not created");
				}
			}
		}
	}
}
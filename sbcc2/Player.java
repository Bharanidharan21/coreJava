package com.Bharani.sbcc2;

public class Player {
	
	private String playerId;
	private String playerName;
	private int matchesPlayed;
	private int runScored;
	private String playingZone;
	public Player() {
	
	}
	public Player(String playerId, String playerName, int matchesPlayed, int runScored, String playingZone) {
		
		this.playerId = playerId;
		this.playerName = playerName;
		this.matchesPlayed = matchesPlayed;
		this.runScored = runScored;
		this.playingZone = playingZone;
	}
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	public int getRunScored() {
		return runScored;
	}
	public void setRunScored(int runScored) {
		this.runScored = runScored;
	}
	public String getPlayingZone() {
		return playingZone;
	}
	public void setPlayingZone(String playingZone) {
		this.playingZone = playingZone;
	}
	
	public int calculateTotalRuns(String[]  runScored)
	{
		int totalRun=0;
		
		for(int i=0;i<runScored.length;i++)
		{
			 totalRun+= Integer.parseInt(runScored[i]);
		}
		
		return totalRun;
	}
	
	
}
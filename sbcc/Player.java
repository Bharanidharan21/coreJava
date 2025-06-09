package com.Bharani.sbcc; 



public class Player {
	String playerId; 
	String playerName; 
	int matchesPlayed; 
	int runScored ;
	String playingZone ;
	
	public Player() 
	{
		
	}

	public Player(String playerId, String playerName, int matchesPlayed, int runScored, String playingZone) {
		super();
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

    
}

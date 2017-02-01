package org.foobarspam.bowling.game;

public class ScoreCard {
	private String scoreCard = "";
	private int totalScore = 0;
	final static String symbols = "-123456789X/";
	private Boolean spare = false;
	private Boolean firstRoll = true;
	private int firstRollPins = 0;
	
	public ScoreCard (String pins){
		this.setScoreCard(pins);
	}
	
	public String getScoreCard(){
		return scoreCard;
	}
	public void setScoreCard(String scoreCard){
		this.scoreCard = scoreCard;	
	}
	
	public int getTotalScore(){
		return totalScore;
	}
	public void setTotalScore(int score){
		this.totalScore = score;
	}
	
	public String getSymbols(){
		return symbols;
	}
	public static int getSimbolValue(char symbol){
		return symbols.indexOf(symbol);
	}
	
	public Boolean getSpare(){
		return spare;
	}
	public void setSpare(Boolean spare){
		this.spare = spare;
	}
	
	public Boolean getFirstRoll(){
		return firstRoll;
	}
	public void setFirstRoll(Boolean firstRoll){
		this.firstRoll = firstRoll;
	}
	
	private void setFirstRollPins(int pins){
		this.firstRollPins = pins;
	}
	
	private int getFirstRollPins(){
		return this.firstRollPins;
	}
	
	
	public void roll(char pin){
		int pinValue = getSimbolValue(pin);
		
		if(getFirstRoll()){
			setFirstRollPins(pinValue);
			setFirstRoll(false);
			if(getSpare()){
				setTotalScore(getTotalScore() + pinValue);
			}
		}
		else if(pin == '/'){
			setTotalScore(getTotalScore() + 10);
			setSpare(true);
			setFirstRoll(true);		
		}
		else {
			setTotalScore(getTotalScore() + getFirstRollPins() + pinValue);
			setFirstRoll(true);
			setSpare(false);
	}
	}
}

package org.foobarspam.bowlinggame.Game;

public class Frame {
	
	private int throwOne = 0;
	private int throwTwo = 0;
	
	public Frame(int throwOne, int throwTwo){
		this.throwOne = throwOne;
		this.throwTwo = throwTwo;
	}
	
	public void setThrowOne(){
		this.throwOne = throwOne;
	}
	
	public int getThrowOne(){
		return this.throwOne;
	}
	
	public void setThrowTwo(){
		this.throwTwo = throwTwo;
	}
	
	public int getThrowTwo(){
		return this.throwTwo;
	}
	
	public int frameScore(){
		return getThrowOne() + getThrowTwo();
	}
}

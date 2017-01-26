package org.foobarspam.añosbisiestos;

public class Year {
	
	private int year = 0;
	
	public Year(int year){
		this.year = year;		
	}
	
	public int getYear(){
		return this.year;
	}
	
	public Boolean esBisiesto(){
		return (((getYear() % 4 == 0 && getYear() % 100 != 0) || getYear() % 400 == 0) && getYear() > 0);
	}
}


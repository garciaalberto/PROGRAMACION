package org.foobarspam.figurasgeometricas.figuras;

public class Elipse extends FiguraGeometrica{

	private double radioMayor = 0d;
	private double radioMenor = 0d;
	
	public Elipse(){
		super();
	}
	
	public Elipse(double radioMayor, double radioMenor){
		super();
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}
	
	public Elipse(String nombre, double radioMayor, double radioMenor){
		super(nombre);
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}

	public double getRadioMayor(){
		return this.radioMayor;
	}
	
	public void setAltura(double radioMayor){
		this.radioMayor = radioMayor;
	}
	
	public double getRadioMenor(){
		return this.radioMenor;
	}
	
	public void setAnchura(double radioMenor){
		this.radioMenor = radioMenor;
	}
	
	@Override
	public double area(){
		double area = getRadioMayor() * getRadioMenor() * Math.PI;
		return area;
	}
}

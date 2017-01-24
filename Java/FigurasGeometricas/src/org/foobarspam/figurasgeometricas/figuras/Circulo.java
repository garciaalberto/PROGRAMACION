package org.foobarspam.figurasgeometricas.figuras;

public class Circulo extends FiguraGeometrica{
	
	private double radio = 0d;
	
	public Circulo(){
		super();
	}
	public Circulo(double radio){
		super();
		this.radio = radio;
	}
	public Circulo(String nombre, double radio){
		super(nombre);
		this.radio = radio;
	}
	
	public double getRadio(){
		return this.radio;
	}
	
	public void setLado(double radio){
		this.radio = radio;
	}
	
	@Override
	public double area(){
		double area = getRadio() * getRadio() * Math.PI;
		return area;
	}
}

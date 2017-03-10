package org.foobarspam.figurasgeometricas.figuras;

// Clase abstracta de la que heredaran las figuras geometricas
abstract class FiguraGeometrica implements Drawable{
	// Propiedades abstractas
	protected String nombre;
	
	public FiguraGeometrica(){
		this.nombre = "Nullerino";
	}
	
	public FiguraGeometrica(String nombre){
		this.nombre = nombre;
	}
	
	//Tratamiento interno de la variable nombre
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	// Métodos abstractos
	public abstract double area();
}
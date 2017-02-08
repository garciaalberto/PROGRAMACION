package org.foobarspam.POO.tablaasignacion;

public class TablaAsignacion {
	// Propiedades
	private final static String tabla = "TRWAGMYFPDXBNJZSQVHLCKE";
	private int valor;
	
	// Constructores
	public TablaAsignacion(){
		
	}

	public TablaAsignacion(int valor){
		this.valor = valor;
	}
	
	// Getters y Setters
	public static String getTabla() {
		return tabla;
	}

	public int getValor() {
		return valor;
	}

	// Métodos
	public String valorLetra(){
		if (getValor() < 23){
		return Character.toString(getTabla().charAt(getValor()));
		} else {
			return null;
		}
	}
	
	
	
}

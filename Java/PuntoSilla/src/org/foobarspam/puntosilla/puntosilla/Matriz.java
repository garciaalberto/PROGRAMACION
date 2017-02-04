package org.foobarspam.puntosilla.puntosilla;

public class Matriz{
	private int[][] matriz;
	private int numeroValores = 0;
	private Boolean menor = false;
	private int[] listaMenores;
	

	// Constructores
	public Matriz(int[][] matriz){
		this.matriz = matriz;
		this.listaMenores = new int[matriz.length];
	}

	// Setters y getters
	
	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}
	
	public int getNumeroValores() {
		return numeroValores;
	}

	public void setNumeroValores(int numeroValores) {
		this.numeroValores = numeroValores;
	}
	
	public Boolean getMenor() {
		return menor;
	}

	public void setMenor(Boolean menor) {
		this.menor = menor;
	}

	public int[] getListaMenores() {
		return listaMenores;
	}

	public void setListaMenores(int menores) {
		this.listaMenores = listaMenores;
	}
	
	// Metodos
	
	public int recorrerMatriz(){
		for (int filas = 0; filas < getMatriz().length; filas++){
			for (int posicion = 0; posicion < getMatriz()[filas].length; posicion++){
				setNumeroValores(getNumeroValores() + 1);
			}
		}
		return getNumeroValores();
	}
	
	public int[] minimoFila(){
		int menor = 0;
		for (int filas = 0; filas < getMatriz().length; filas++){
			for (int posicion = 0; posicion < getMatriz()[filas].length; posicion++){
				if (posicion > menor){
					menor = posicion;
				}
			}
			setListaMenores(getListaMenores()[filas] = menor);
		}
		return getListaMenores();
	}

}

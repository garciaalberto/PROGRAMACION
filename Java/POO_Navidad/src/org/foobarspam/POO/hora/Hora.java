package org.foobarspam.POO.hora;

public class Hora {
	// Propiedades
	private int horas = 0;
	private int minutos = 0;
	private int segundos = 0;
	
	// Constructores
	public Hora(){
		
	}
	
	public Hora(int horas, int minutos, int segundos){
		setHora(horas, minutos, segundos);
	}

	// Getters y setters
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	// Métodos
	public void setHora(int horas, int minutos, int segundos){
		if (horas > 24 || horas < 0){
			this.horas = 0;
		} else {
			this.horas = horas;
		}
		if (minutos > 59 || minutos < 0){
			this.minutos = 0;
		} else {
			this.minutos = minutos;
		}
		if (segundos > 59 || segundos < 0){
			this.segundos = 0;
		} else {
			this.segundos = segundos;
		}
	}
	
	public String getHora(){
		String time;
		if (getHoras() < 10) {
			time = "0" + getHoras();
		} else {
			time = "" + getHoras();
		}
		if (getMinutos() < 10) {
			time = time + ":0" + getMinutos();
		} else {
			time = time + ":" + getMinutos();
		}
		if (getSegundos() < 10) {
			time = time + ":0" + getSegundos();
		} else {
			time = time + ":" + getSegundos();
		}
		return time;
	}
	
	public void imprimirHora(){
		System.out.println(getHora());
	}
}

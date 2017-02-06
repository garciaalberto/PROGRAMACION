package estacion;

import bicicleta.*;
import tarjetaUsuario.*;
import java.util.concurrent.ThreadLocalRandom;

public class Estacion {

	// Variables privadas
	private int id;
	private String direccion;
	private int numeroAnclajes;
	private Bicicleta[] anclajes = new Bicicleta[numeroAnclajes];
	
	// Constructores
	public Estacion(){
		
	}
	
	public Estacion(int id, String direccion, int numeroAnclajes){
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = numeroAnclajes;
		this.anclajes = new Bicicleta[numeroAnclajes];
	}
	
	// Setters y Getters
	public int getId() {
		return id;
	}
	public String getDireccion() {
		return direccion;
	}
	public int getNumeroAnclajes() {
		return numeroAnclajes;
	}
	public void setNumeroAnclajes(int numeroAnclajes) {
		this.numeroAnclajes = numeroAnclajes;
	}
	public Bicicleta[] getAnclajes() {
		return anclajes;
	}
	public void setAnclajes(Bicicleta bicicleta) {
		this.anclajes = anclajes;
	}
	
	// Métodos
	public void consultarEstacion(){
		System.out.println("ID: " + getId());
		System.out.println("Direccion: " + getDireccion());
		System.out.println("Número de anclaje: " + getNumeroAnclajes());
	}
	
	public int anclajesLibres(){
		return getNumeroAnclajes();
	}
	
	public void consultarAnclajes(){
		for (int i = 0; i < getAnclajes().length; i++){
			if (getAnclajes()[i] == null){
				System.out.println("Sitio libre en la posición " + (i+1));
			}else{
			System.out.println("Sitio ocupado por la bicicleta: " + getAnclajes()[i].getId());
			}
		}
	}
	
	public void anclarBicicleta(Bicicleta bicicleta){
		setAnclajes(getAnclajes()[getNumeroAnclajes() - 1] = bicicleta);	
		setNumeroAnclajes(getNumeroAnclajes() - 1);
		mostrarAnclaje(bicicleta, getNumeroAnclajes());
		}
	
	public void mostrarAnclaje(Bicicleta bicicleta,int numeroAnclaje){
		System.out.println("ID Bicicleta: " + bicicleta.getId());
		System.out.println("Anclaje usado: " + (getNumeroAnclajes() + 1));
	}
	
	public Boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario){
		return tarjetaUsuario.isActivada();
	}
	
	public void retirarBicicleta(TarjetaUsuario tarjetaUsuario){
		if (leerTarjetaUsuario(tarjetaUsuario) == true){
			int numeroAnclaje = generarAnclaje();
			while (getAnclajes()[numeroAnclaje] == null){
				numeroAnclaje = generarAnclaje();
			}
			mostrarBicicleta(getAnclajes()[numeroAnclaje], numeroAnclaje);
			getAnclajes()[numeroAnclaje] = null;
			setNumeroAnclajes(getNumeroAnclajes()+1);
		}
	}
	
	public void mostrarBicicleta(Bicicleta bicicleta,int numeroAnclaje){
		System.out.println("Se va a retirar la bicicleta " + bicicleta.getId() + " de la posición " + numeroAnclaje);
	}
	
	public int generarAnclaje(){
		return ThreadLocalRandom.current().nextInt(0, getAnclajes().length);
	}
}

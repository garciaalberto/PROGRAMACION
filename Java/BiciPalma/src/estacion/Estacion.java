package estacion;

import bicicleta.*;
import tarjetaUsuario.*;
import java.util.concurrent.ThreadLocalRandom;

public class Estacion {

	// Variables privadas
	private int id = 0;
	private String direccion = null;
	private int numeroAnclajes = 0;
	private Bicicleta[] anclajes = null;
	
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
		return this.id;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public int getNumeroAnclajes() {
		return this.numeroAnclajes;
	}

	public Bicicleta[] getAnclajes() {
		return this.anclajes;
	}
	public void setAnclajes(Bicicleta bicicleta) {
	}
	
	// Métodos
	public void consultarEstacion(){
		System.out.println("ID: " + getId());
		System.out.println("Direccion: " + getDireccion());
		System.out.println("Número de anclaje: " + getNumeroAnclajes());
	}
	
	public int anclajesLibres(){
		int libres = 0;
		for (Bicicleta anclaje : getAnclajes()){
			if (anclaje == null){
				libres ++;
			}
		}
		return libres;
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
		setAnclajes(getAnclajes()[getAnclajes().length - anclajesLibres()] = bicicleta);	
		anclajesLibres();
		mostrarAnclaje(bicicleta, anclajesLibres());
		}
	
	public void mostrarAnclaje(Bicicleta bicicleta,int numeroAnclaje){
		System.out.println("ID Bicicleta: " + bicicleta.getId());
		System.out.println("Anclaje usado: " + (getAnclajes().length - anclajesLibres()));
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
			anclajesLibres();
		}
	}
	
	public void mostrarBicicleta(Bicicleta bicicleta,int numeroAnclaje){
		System.out.println("Se va a retirar la bicicleta " + bicicleta.getId() + " de la posición " + numeroAnclaje);
	}
	
	public int generarAnclaje(){
		return ThreadLocalRandom.current().nextInt(0, getAnclajes().length);
	}
}
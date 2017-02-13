package org.foobarspam.POO.tarjetaprepago;

import org.foobarspam.POO.DNI.*;
import org.foobarspam.POO.hora.*;

public class TarjetaPrepago {
	// Propiedades
	private String numeroTelefono = null;
	private DNI nif = null;
	private Double saldo = 0d;
	private Hora consumo = new Hora(0, 0, 0);

	// Constructores
	public TarjetaPrepago() {
		
	}
	
	public TarjetaPrepago(String numeroTelefono, DNI nif, Double saldo){
		this.numeroTelefono = numeroTelefono;
		this.nif = nif;
		this.saldo = saldo;
	}

	// Setters y getters
	public String getNumeroTelefono() {
		return this.numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public DNI getNif() {
		return this.nif;
	}

	public void setNif(DNI nif) {
		this.nif = nif;
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Hora getConsumo() {
		return this.consumo;
	}

	public void setConsumo(Hora consumo) {
		this.consumo = consumo;
	}
	
	//Métodos
	public double ingresarSaldo(Double dinero){
		setSaldo(getSaldo() + dinero);
		return getSaldo();
	}
	
	public double enviarMensaje(int mensajes){
		setSaldo(getSaldo() - 0.09 * mensajes);
		return getSaldo();
	}
	
	public double realizarLlamada(int segundos) {
		setSaldo(getSaldo() - (0.15 + segundos * 0.01));
		int segundosTotales = segundos + horaToSeconds(getConsumo());
		setConsumo(secondsToHora(segundosTotales));
		return getSaldo();
	}
	
	public void consultarTarjeta(){
		System.out.println("La targeta prepago con DNI " + getNif().getCompleto());
		System.out.println("y número de teléfono " + getNumeroTelefono() + " vinculado a este");
		System.out.println("dispone del saldo de " + getSaldo() + "€");
		System.out.println("con un consumo total de " + getConsumo().getHora());
	}
	
	// Utilidades
	private Hora secondsToHora(int time){
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		while (time >= 3600){
			horas += 1;
			time -= 3600;
		}
		while (time >= 60) {
			minutos += 1;
			time -= 60;
		}
		while (time > 0) {
			segundos += 1;
			time -= 1;
		}
		Hora hora = new Hora(horas, minutos, segundos);
		return hora;
	}
	
	private int horaToSeconds(Hora hora){
		int segundosTotales = 0;
		segundosTotales += hora.getHoras() * 3600;
		segundosTotales += hora.getMinutos() * 60;
		segundosTotales += hora.getSegundos();
		return segundosTotales;
	}
}

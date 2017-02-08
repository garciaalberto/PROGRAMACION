package org.foobarspam.POO.cuentacorriente;

import org.foobarspam.POO.DNI.*;

public class CuentaCorriente {
	// Propiedades
	private String nombre;
	private String apellidos;
	private String direccion;
	private String telefono;
	private DNI nif;
	private double saldo;
	
	// Constructores
	public CuentaCorriente() {
		
	}
	
	public CuentaCorriente(String nombre, String apellidos, String direccion, String telefono, DNI nif, double saldo){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nif = nif;
		this.saldo = saldo;
	}

	// Setters y getters
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public DNI getNif() {
		return nif;
	}
	
	// Métodos
	public double retirarDinero(double dinero){
		setSaldo(getSaldo() - dinero);
		return getSaldo();
	}
	
	public double ingresarDinero(double dinero){
		setSaldo(getSaldo() + dinero);
		return getSaldo();
	}
	
	public void consultarCuenta(){
		System.out.println("La cuenta a nombre de: " + getNombre() + " " + getApellidos());
		System.out.println("Con la dirección: " + getDireccion());
		System.out.println("Con el teléfono: " + getTelefono());
		System.out.println("Y NIF: " + getNif().getCompleto());
		System.out.println("Dispone de " + getSaldo() + "€ en su cuenta corriente");
	}
	
	public Boolean saldoNegativo(){
		if (getSaldo() < 0){
			return true;
		} else {
			return false;
		}
	}
}

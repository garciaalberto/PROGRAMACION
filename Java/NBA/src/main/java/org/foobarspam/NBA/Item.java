package org.foobarspam.NBA;

import java.util.ArrayList;

public class Item implements Iterable, Componible{

	private String nombre;
	private Boolean compuesto;
	private ArrayList<Item> hijos = new ArrayList<Item>();
	
	Item(){
		
	}
	
	Item(String nombre, Boolean compuesto){
		this.nombre = nombre;
		this.compuesto = compuesto;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Boolean isCompuesto() {
		return this.compuesto;
	}
	public void setCompuesto(Boolean compuesto) {
		this.compuesto = compuesto;
	}
	public ArrayList<Item> getHijos() {
		return this.hijos;
	}
	public void anhadirHijo(Item hijo){
		if(this.compuesto){
			this.hijos.add(hijo);
		}
		else{
			System.out.println("No se puede añadir un hijo a un objeto simple");
		}
	}
	public void iterate() {
		System.out.println(getNombre());
		for (Item hijo : this.getHijos()){
			if (!hijo.isCompuesto()){
				System.out.println("----------" + hijo.getNombre());
			} else {
				hijo.iterate();
			}
		}
	}
	public void composite(String[] args) {
		for (String hijo : args){
			this.anhadirHijo(new Item(hijo, false));
		}
	}
	
	public void quitar(String nombre){
		ArrayList<Item> toRemove = new ArrayList<Item>();
		for (Item hijo : this.getHijos()){
			if (nombre == hijo.getNombre()){
				toRemove.add(hijo);
			} else {
				hijo.quitar(nombre);
			}
		}
		this.getHijos().removeAll(toRemove);
	}
	
	public void composite(ArrayList<Item> hijos) {
		for (Item hijo : hijos){
			this.anhadirHijo(hijo);
		}
	}
}

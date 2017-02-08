package org.foobarspam.POO.DNI;

import org.foobarspam.POO.tablaasignacion.*;

	public class DNI {
		// Propiedades
		private int numero;
		private String completo;
		
		// Constructores
		public DNI(){
	
		}

		public DNI(int numero){
			this.numero = numero;
		}
		
		public DNI(String completo){
			this.completo = completo;
		}
		
		
		// Setters y getters
		
		public int getNumero() {
			return numero;
		}

		public String getCompleto() {
			return completo;
		}

		public void setCompleto(String completo) {
			this.completo = completo;
		}
		
		// Métodos
		public String dniBuilder(){
			TablaAsignacion tablaAsignacion = new TablaAsignacion(getNumero() % 23);
			setCompleto(String.valueOf(getNumero()));
			setCompleto(getCompleto() + tablaAsignacion.valorLetra());
			return getCompleto();
		}
}
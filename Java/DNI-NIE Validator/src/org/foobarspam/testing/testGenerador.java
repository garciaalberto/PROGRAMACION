package org.foobarspam.testing;

import org.foobarspam.generator.GeneradorDNINIE;

import org.junit.Test;

public class testGenerador {

	GeneradorDNINIE generador = new GeneradorDNINIE();
	
	
	@Test
	public void testGenerarDNIBueno() {
		System.out.println(generador.generarDNIBueno());
		System.out.println("");
	}

	@Test
	public void testGenerarDNIMalo() {
		System.out.println(generador.generarDNIMalo());
		System.out.println("");
	}
	
	@Test
	public void testGenerarNIEBueno() {
		System.out.println(generador.generarNIEBueno());
		System.out.println("");
	}
	
	@Test
	public void testGenerarNIEMalo() {
		System.out.println(generador.generarNIEMalo());
		System.out.println("");
	}
}

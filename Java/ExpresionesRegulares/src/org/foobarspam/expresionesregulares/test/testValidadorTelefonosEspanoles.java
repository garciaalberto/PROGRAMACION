package org.foobarspam.expresionesregulares.test;

import static org.junit.Assert.*;

import org.junit.Test;

import org.foobarspam.expresionesregulares.validadores.ValidadorTelefonosEspanoles;;

public class testValidadorTelefonosEspanoles {

	@Test
	public void testValidarTelefono() {
		String tlf1 = "971000000";
		String tlf2 = "871123879";
		String tlf3 = "weno";
		String tlf4 = "1283794";
		
		assertTrue(ValidadorTelefonosEspanoles.validarTelefono(tlf1));
		assertTrue(ValidadorTelefonosEspanoles.validarTelefono(tlf2));
		assertFalse(ValidadorTelefonosEspanoles.validarTelefono(tlf3));
		assertFalse(ValidadorTelefonosEspanoles.validarTelefono(tlf4));
	}

}

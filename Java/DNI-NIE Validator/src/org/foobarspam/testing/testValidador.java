package org.foobarspam.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import org.foobarspam.validator.Validador;
import org.foobarspam.generator.GeneradorDNINIE;;;

public class testValidador {

	@Test
	public void testExpresionRegular() {
		String dniBien = "12345678W";
		String dniMal = "12874P";

		assertTrue(Validador.checkEstructura(dniBien));
		assertFalse(Validador.checkEstructura(dniMal));
	}

	@Test
	public void testArrayDNINIE() {
		String[] casosTest = {
				// casos DNI PASS
				"78484464T", "72376173A", "01817200Q", "95882054E", "63587725Q", "26861694V", "21616083Q", "26868974Y",
				"40135330P", "89044648X", "80117501Z", "34168723S", "76857238R", "66714505S", "66499420A",
				// casos NIE PASS
				"X1234567T", "Y1234567T", "Z1234567T",
				// casos NIE FAIL
				"J1234567T", "H1234567T", "R1234567T", "X12345678X", "X1234T", "X1234567I" };

		Validador.comprobarArray(casosTest); // Esto debería imprimir el
												// resultado de recorrer el
												// array y compararlo con el
												// patrón
	}
	
	@Test
	public void testDNIRandomizados(){
		GeneradorDNINIE generador = new GeneradorDNINIE();
		String dniBien = generador.generarDNIBueno();
		String dniMal = generador.generarDNIMalo();
		
		assertTrue(Validador.checkEstructura(dniBien));
		assertFalse(Validador.checkEstructura(dniMal));
	}
	
	@Test
	public void testNIERandomizados(){
		GeneradorDNINIE generador = new GeneradorDNINIE();
		String nieBien = generador.generarNIEBueno();
		String nieMal = generador.generarNIEMalo();
		
		assertTrue(Validador.checkEstructura(nieBien));
		assertFalse(Validador.checkEstructura(nieMal));
	}
	
}

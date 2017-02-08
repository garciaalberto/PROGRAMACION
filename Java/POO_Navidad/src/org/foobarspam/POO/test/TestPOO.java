package org.foobarspam.POO.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.foobarspam.POO.tablaasignacion.*;
import org.foobarspam.POO.DNI.*;
import org.foobarspam.POO.cuentacorriente.*;

public class TestPOO {

	@Test
	public void testTablaAsignacion() {
		assertEquals("TRWAGMYFPDXBNJZSQVHLCKE", TablaAsignacion.getTabla());
	}

	@Test
	public void testValorLetra(){
		TablaAsignacion tablaAsignacion1 = new TablaAsignacion(2);
		assertEquals("W", tablaAsignacion1.valorLetra());
		
		TablaAsignacion tablaAsignacion2 = new TablaAsignacion(23);
		assertEquals(null, tablaAsignacion2.valorLetra());
	}
	
	@Test
	public void testDNI(){
		DNI dniA = new DNI(41585112);
		assertEquals("41585112P", dniA.dniBuilder());
		DNI dniJ = new DNI(41584820);
		assertEquals("41584820S", dniJ.dniBuilder());
	}
	
	@Test
	public void testRetirarDinero(){
		DNI dniA = new DNI("41585112P");
		CuentaCorriente cuentaCorriente1 = new CuentaCorriente("Alberto", "García", "Dirección Inventada nº123", "971554600", dniA, 121.50);
		assertEquals(21.50, cuentaCorriente1.retirarDinero(100.00), 0.001);
		assertEquals(11.50, cuentaCorriente1.retirarDinero(10.00), 0.001);
	}
	
	@Test
	public void testIngresarDinero(){
		DNI dniA = new DNI("41585112P");
		CuentaCorriente cuentaCorriente1 = new CuentaCorriente("Alberto", "García", "Dirección Inventada nº123", "971554600", dniA, 11.50);
		assertEquals(511.50, cuentaCorriente1.ingresarDinero(500.00), 0.001);
		assertEquals(521.50, cuentaCorriente1.ingresarDinero(10.00), 0.001);
	}
	
	@Test
	public void testConsultarCuenta(){
		DNI dniA = new DNI("41585112P");
		CuentaCorriente cuentaCorriente1 = new CuentaCorriente("Alberto", "García", "Dirección Inventada nº123", "971554600", dniA, 11.50);
		cuentaCorriente1.consultarCuenta();
	}
	
	@Test
	public void testSaldoNegativo(){
		DNI dniA = new DNI("41585112P");
		CuentaCorriente cuentaCorriente1 = new CuentaCorriente("Alberto", "García", "Dirección Inventada nº123", "971554600", dniA, 11.50);
		assertEquals(false, cuentaCorriente1.saldoNegativo());
		cuentaCorriente1.retirarDinero(50.00);
		assertEquals(true, cuentaCorriente1.saldoNegativo());
	}
	
}

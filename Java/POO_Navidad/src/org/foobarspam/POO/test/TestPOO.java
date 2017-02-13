package org.foobarspam.POO.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.foobarspam.POO.tablaasignacion.*;
import org.foobarspam.POO.DNI.*;
import org.foobarspam.POO.cuentacorriente.*;
import org.foobarspam.POO.hora.*;
import org.foobarspam.POO.tarjetaprepago.*;

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
		cuentaCorriente1.consultarCuenta(); // Should print account information
	}
	
	@Test
	public void testSaldoNegativo(){
		DNI dniA = new DNI("41585112P");
		CuentaCorriente cuentaCorriente1 = new CuentaCorriente("Alberto", "García", "Dirección Inventada nº123", "971554600", dniA, 11.50);
		assertEquals(false, cuentaCorriente1.saldoNegativo());
		cuentaCorriente1.retirarDinero(50.00);
		assertEquals(true, cuentaCorriente1.saldoNegativo());
	}
	
	@Test
	public void testGetHora(){
		Hora hora1 = new Hora(01, 30, 56);
		assertEquals("01:30:56", hora1.getHora());
		Hora hora2 = new Hora(20, 78, 91);
		assertEquals("20:00:00", hora2.getHora());
		Hora hora3 = new Hora(-12, 32, -3);
		assertEquals("00:32:00", hora3.getHora());
	}
	
	@Test 
	public void testImprimirHora(){
		Hora hora = new Hora(01, 30, 56);
		hora.imprimirHora(); // Should equal to 01:30:56
	}
	
	@Test
	public void testIngresarSaldo(){
		DNI dniA = new DNI("41585112P");
		TarjetaPrepago tarjetaPrepago1 = new TarjetaPrepago("971554600", dniA, 10.00);
		assertEquals(15.00, tarjetaPrepago1.ingresarSaldo(5.00), 0.001);
		TarjetaPrepago tarjetaPrepago2 = new TarjetaPrepago("123456789", dniA, 0.00);
		assertEquals(10.00, tarjetaPrepago2.ingresarSaldo(10.00), 0.001);
	}
	
	@Test
	public void testEnviarMensaje(){
		DNI dniA = new DNI("41585112P");
		TarjetaPrepago tarjetaPrepago1 = new TarjetaPrepago("971554600", dniA, 10.00);
		assertEquals(9.10, tarjetaPrepago1.enviarMensaje(10), 0.001);
	}
	
	@Test
	public void testRealizarLlamada(){
		DNI dniA = new DNI("41585112P");
		TarjetaPrepago tarjetaPrepago1 = new TarjetaPrepago("971554600", dniA, 10.00);
		assertEquals(8.05, tarjetaPrepago1.realizarLlamada(180), 0.001);
		System.out.println(tarjetaPrepago1.getConsumo().getHora()); // Should equal to 00:03:00
	}
	
	@Test
	public void testConsultarTarjeta(){
		DNI dniA = new DNI("41585112P");
		TarjetaPrepago tarjetaPrepago1 = new TarjetaPrepago("971554600", dniA, 10.00);
		tarjetaPrepago1.consultarTarjeta(); // Should print prepaid cart information
	}
}

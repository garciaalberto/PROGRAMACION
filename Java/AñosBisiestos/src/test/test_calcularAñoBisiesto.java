package test;

import static org.junit.Assert.*;

import org.foobarspam.añosbisiestos.*;

import org.junit.Test;

public class test_calcularAñoBisiesto {

	@Test
	public void test_esBisiesto_cuatro() {
	Year any = new Year(1904);
	assertTrue(any.esBisiesto());
	}
	
	@Test
	public void test_esBisiesto_seis(){
	Year any = new Year(2016);
	assertTrue(any.esBisiesto());
	}
	
	@Test
	public void test_esBisiesto_tres(){
	Year any = new Year(2003);
	assertFalse(any.esBisiesto());
	}
	
	@Test
	public void test_esBisiesto_cuatrocientos(){
	Year any = new Year(2400);
	assertTrue(any.esBisiesto());
	}
	
	@Test
	public void test_esBisiesto_cien(){
	Year any = new Year(2100);
	assertFalse(any.esBisiesto());
	}
	
	@Test
	public void test_esBisiesto_doscientos(){
	Year any = new Year(2200);
	assertFalse(any.esBisiesto());
	}
	
	@Test
	public void test_esBisiesto_trescientos(){
	Year any = new Year(2300);
	assertFalse(any.esBisiesto());
	}
	
	@Test
	public void test_esBisiesto_cero(){
	Year any = new Year(0);
	assertFalse(any.esBisiesto());
	}
	
	@Test
	public void test_esBisiesto_negativo(){
	Year any = new Year(-1);
	assertFalse(any.esBisiesto());
	}
	
	@Test
	public void test_esBisiesto_siete(){
	Year any = new Year(1997);
	assertFalse(any.esBisiesto());
	}
}
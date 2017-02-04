package org.foobarspam.puntosilla.test;

import static org.junit.Assert.*;

import org.junit.Test;

import org.foobarspam.puntosilla.puntosilla.*;

public class PuntoSillaTest {

	@Test
	public void testRecorrerMatriz() {
		int[][] matriz = { { 2, 1, 3 }, 
                { 1, 3, 4 }, 
                { 7, 5, 6 } };
		Matriz matriz1 = new Matriz(matriz);
		matriz1.recorrerMatriz();
		assertEquals(9, matriz1.getNumeroValores());
	}
	
	@Test
	public void testMinimoFila(){
		int[][] matriz = { { 2, 1, 3 }, 
                { 1, 3, 4 }, 
                { 7, 5, 6 } };
		int[] resultados = new int[]{1, 1, 5};
		Matriz matrizParaTest = new Matriz(matriz);
		matrizParaTest.minimoFila();
		assertEquals(resultados, matrizParaTest.getListaMenores());
	}

}

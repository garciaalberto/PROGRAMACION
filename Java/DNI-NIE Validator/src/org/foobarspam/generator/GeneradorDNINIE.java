package org.foobarspam.generator;

import java.util.concurrent.ThreadLocalRandom;

public class GeneradorDNINIE {
	
	public String generarDNIBueno() {

		Integer numero = 0;
		int indice = 0;
		char letra = '\0';
		String DniBueno = null;

		numero = ThreadLocalRandom.current().nextInt(10000000, 100000000);

		do {
			indice = ThreadLocalRandom.current().nextInt(65, 91);
			letra = (char) indice;
		} while (letra == 'I' || letra == 'O' || letra == 'U');

		DniBueno = numero.toString() + letra;

		return DniBueno;
	}

	public String generarDNIMalo() {

		Integer numero = 0;
		int indice = 0;
		char letra = '\0';
		String DNIMalo = null;

		numero = ThreadLocalRandom.current().nextInt(10000000, 100000000);

		char[] letrasProhibidas = { 'I', 'U', 'O', 'Ñ' };

		indice = ThreadLocalRandom.current().nextInt(0, 4);

		letra = letrasProhibidas[indice];

		DNIMalo = numero.toString() + letra;

		return DNIMalo;
	}
	
	public String generarNIEBueno() {

		int indice = 0;
		char primeraLetra = '\0';
		Integer numero = 0;
		int indiceP = 0;
		char letra = '\0';
		String NieBueno = "";

		char[] primerLetraPermitidas = { 'X', 'Y', 'Z' };

		indice = ThreadLocalRandom.current().nextInt(0, 3);
		primeraLetra = primerLetraPermitidas[indice];

		numero = ThreadLocalRandom.current().nextInt(1000000, 10000000);

		do {
			indiceP = ThreadLocalRandom.current().nextInt(65, 91);
			letra = (char) indiceP;
		} while (letra == 'I' || letra == 'O' || letra == 'U');

		NieBueno = primeraLetra + numero.toString() + letra;

		return NieBueno;
	}

	public String generarNIEMalo() {

		int indice = 0;
		char primeraLetra = '\0';
		Integer numero = 0;
		int indiceP = 0;
		char letra = '\0';
		String NIEMalo = null;

		char[] primerLetraPermitidas = { 'X', 'Y', 'Z' };

		indice = ThreadLocalRandom.current().nextInt(0, 3);
		primeraLetra = primerLetraPermitidas[indice];

		numero = ThreadLocalRandom.current().nextInt(1000000, 10000000);
		char[] letrasProhibidas = { 'I', 'U', 'O', 'Ñ' };

		indiceP = ThreadLocalRandom.current().nextInt(0, 3);

		letra = letrasProhibidas[indiceP];


		NIEMalo = primeraLetra + numero.toString() + letra;

		return NIEMalo;
	}
}

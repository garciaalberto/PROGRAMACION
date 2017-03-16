package org.foobarspam.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validador {
	
	static private String regEx = "\\b\\d{8}[A-Z&&[^ÑOUI]]|\\b[XYZ]\\d{7}[A-Z&&[^ÑOUI]]";
	
	static Pattern patron = Pattern.compile(regEx);
	
	public static boolean checkEstructura(String identificador){
		
		Matcher checker = patron.matcher(identificador);
		return checker.find();
		
	}
	
	public static void comprobarArray(String[] identificadores){
		for (String identificador : identificadores){
			if (checkEstructura(identificador)){
				System.out.println("El DNI " + identificador + " coincide con el patrón");	
			} else {
				System.out.println("No se ha encontrado a Pablo Emilio Escobar Gaviria");
			}
		}
	}
	
}

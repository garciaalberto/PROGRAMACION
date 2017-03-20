package org.foobarspam.expresionesregulares.validadores;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorTelefonosEspanoles {
	
	public ValidadorTelefonosEspanoles(){
		
	}
	
	static private String regExTlf = "\\b[98][1-8]\\d{7}\\b";
	
	static Pattern formatoTlf = Pattern.compile(regExTlf);
	
	public static boolean validarTelefono(String tlf){
		 Matcher verificador = formatoTlf.matcher(tlf);
		 return verificador.find();
	}
	
}

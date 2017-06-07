package org.foobarspam.NBA;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		// crear item simple y testear su nombre
		
		System.out.println("\n *** crear item simple y testear su nombre *** \n");
		
			Item equipo = new Item("Lakers", false);
		 	System.out.println("equipo: " + equipo.getNombre());
		
		
		// crear item compuesto y testear su nombre
		
		System.out.println("\n *** crear item compuesto y testear su nombre *** \n");
		
			Item division = new Item("Pacific", true);
		 	System.out.println("división: " + division.getNombre());
		
		
		// añadir item simple a compuesto y comprobar nombre
		
		System.out.println("\n *** añadir item simple a compuesto y comprobar nombre *** \n");
		
			division.anhadirHijo(equipo);		
			System.out.println("OK: Se ha añadido item equipo" + equipo.getNombre());
		
		//  recorrer un item compuesto mostrando su nombre y el de sus hijos: 1 hijo, profundidad 1
		
		System.out.println("\n *** recorrer un item compuesto mostrando su nombre y el de sus hijos: 1 hijo, profundidad 1 *** \n");
		
			division.iterate();
		
		
		// añadir varios hijos desde array de strings y recorrer un item compuesto mostrando su nombre y el de sus hijos: n hijos, profundidad 1
		
		System.out.println("\n ***añadir varios hijos desde array de strings y recorrer un item compuesto mostrando su nombre y el de sus hijos: n hijos, profundidad 1 *** \n");
		
			Item atlantic = new Item("Atlantic", true);
		
			String[] equiposAtlantic = {"Celtics", "Nets", "Knicks", "76ers", "Raptors"};
		
			atlantic.composite(equiposAtlantic);
			atlantic.iterate();
		
		// recorrer un item compuesto por otros compuestos, mostrando su nombre y el de sus hijos: n hijos, profundidad n 
		
		System.out.println("\n *** recorrer un item compuesto por otros compuestos, mostrando su nombre y el de sus hijos: n hijos, profundidad n *** \n");
		
			Item nba = new Item("NBA", true);
			Item este = new Item("Este", true);
			ArrayList<Item> sectores = new ArrayList<Item>();
			sectores.add(este);
			sectores.add(atlantic);
			
			nba.composite(sectores);
			nba.iterate();
		
		// crear un elemento compuesto de simples a partir de un array de strings
		
		System.out.println("\n *** crear un elemento compuesto de simples a partir de un array de strings *** \n");
		
		String[] equiposCentral = {"Bulls", "Cavs", "Pistons", "Pacers", "Bucks"};
		
			Item central = new Item("Central", true);
			central.composite(equiposCentral);
			central.iterate();
			
		// crear un elemento compuesto de elementos compuestos a partir de un array de objetos simples

		System.out.println("\n *** crear un elemento compuesto de elementos compuestos a partir de un array de objetos simples *** \n");
		
		String[] equiposSouthEast = {"Heat", "Hawks", "Hornets", "Wizzards", "Magic"};
		
			// crear un arraylist de equipos SouthEast
			ArrayList<Item> southeast = new ArrayList<Item>();
			Item southEast = new Item("ShouthEast", true);
			southEast.composite(equiposSouthEast);
			southeast.add(southEast);
			southEast.iterate();
			// crear division SouthEast y añadir los equipos SouthEast 
		
			// añadir division SouthEast
		
		
		// crear un elemento compuesto de elementos compuestos a partir de un array de objetos compuestos
		
		System.out.println("\n *** crear un elemento compuesto de elementos compuestos a partir de un array de objetos compuestos *** \n");
		
			ArrayList<Item> zonasEste = new ArrayList<Item>();
			zonasEste.add(atlantic);
			zonasEste.add(central);
			zonasEste.add(southEast);
			este.composite(zonasEste);
			este.iterate();
			// añadirlas a la conferencia este
		
		
		
		// eliminar un hijo entre varios, profundidad 1
		
		System.out.println("\n *** eliminar un hijo a profundidad n *** \n");

				nba.quitar("Atlantic");
				// metodo quitar("Atlantic");	 se busca por el nombre de la división, no por el objeto.		
				nba.iterate();
		
		// Crea la conferencia Oeste completa y añadela a la liga; muestra por pantalla la liga completa
		
		System.out.println("\n *** Liga NBA completa con sus conferencias, divisiones y equipos *** \n");

	}
}
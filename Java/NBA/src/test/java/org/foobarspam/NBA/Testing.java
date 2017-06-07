package org.foobarspam.NBA;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testing {
	
	@Test
	public void testItemSimple(){
		Item equipo = new Item("Lakers", false);
		assertEquals(equipo.getNombre(), "Lakers");
		assertEquals(equipo.isCompuesto(), false);
	}
	
	@Test
	public void testItemCompuesto(){
		Item division = new Item("Pacific", true);
		assertEquals(division.getNombre(), "Pacific");
		assertEquals(division.isCompuesto(), true);
	}
	
	@Test
	public void testAnhadir(){
		Item equipo = new Item("Lakers", false);
		Item division = new Item("Pacific", true);
		division.anhadirHijo(equipo);
		for (Item item : division.getHijos()){
			assertEquals(item.getNombre(), "Lakers");
		}
	}
	
	@Test
	public void testIterable(){
		Item kn = new Item("Knicks", false);
		Item nt = new Item("Nets", false);
		Item division = new Item("Atlantic", true);
		division.anhadirHijo(kn);
		division.anhadirHijo(nt);
		System.out.println("***TEST ITERABLE***");
		division.iterate();
	}
}

package org.foobarspam.bowlinggame.test;

import static org.junit.Assert.*;
import org.foobarspam.bowlinggame.Game.*;

import org.junit.Test;

public class GameTest {

	@Test
	public void frameTest() {
		Frame throwOne = new Frame(3,3);
		assertEquals(6, throwOne.frameScore());
	}
	
	@Test
	public void gameScore() {
		Game gameOne = new Game("12345123451234512345");
		assertEquals(60, gameOne.gameScore());
	}

}

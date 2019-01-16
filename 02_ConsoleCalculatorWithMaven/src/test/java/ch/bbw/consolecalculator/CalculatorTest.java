package ch.bbw.consolecalculator;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Test Class for Class Calculator
 * 
 * @author Jovan Bühler
 * @version 0.0.1
 */

public class CalculatorTest {
	Calculator testee;

	@Test
	public void test() {
		testee = new Calculator();
		assertTrue(testee.summe(10,25)== 35);
	}

}

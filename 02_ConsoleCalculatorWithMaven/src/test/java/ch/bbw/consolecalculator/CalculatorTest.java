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
	public void testSummeZweiPositiveOk() {
		testee = new Calculator();
		assertTrue(testee.summe(10,25)== 35);
	}
	
	@Test
	public void testSubthraktionZweiPositiveOk() {
		testee = new Calculator();
		assertTrue(testee.differenz(25, 5)== 20);
	}
	
	@Test
	public void testMultiplicationZweiPositiveOk() {
		testee = new Calculator();
		assertTrue(testee.produkt(8, 125)== 1000); 
	}
	
	@Test
	public void testDivisionZweiPositiveOk() {
		testee = new Calculator();
		assertTrue(testee.quotient(10, 2)== 5);
	}

}

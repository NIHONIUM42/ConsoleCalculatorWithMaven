package ch.bbw.consolecalculator;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Test Class for Class testeee
 * 
 * @author Jovan Bühler
 * @version 0.0.1
 */

public class CalculatorTest {
	Calculator testeee;

	/*
	@Test(expected = ArithmeticException.class)
	public void testQuotientPosNull() {
		testeee = new Calculator();
		testeee.quotient(25, 0);
	}*/
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testSummeZweiPositiveWithOverflowThrowsException(){
		testeee = new Calculator();
		assertTrue(testeee.summe(Integer.MAX_VALUE, 2) != 0);
	}
	
	//exception expected, otherwise test fails
	/*@Test(expected=java.lang.ArithmeticException.class)
	public void testDifferenzByZeroThrowsException(){
		testeee = new Calculator();
		assertTrue(testeee.differenz(10,0) == Double.POSITIVE_INFINITY);
	}*/
	
	//tests mit Max- und Min-Value
	/*@Test
	public void testSummeMaximum1()   {
		testeee = new Calculator();
		assertTrue(testeee.summe(4.0, Double.MAX_VALUE) == (Double.MAX_VALUE));
	}*/

	@Test
	public void testSummeMinimum1()   {
		testeee = new Calculator();
		assertTrue(testeee.summe(4.0, Double.MIN_VALUE) == (4));
	}

	@Test
	public void testSummeMinimum2()   {
		testeee = new Calculator();
		assertTrue(testeee.summe(Double.MIN_VALUE, Double.MIN_VALUE) == (Double.MIN_VALUE + Double.MIN_VALUE));
	}
	
	@Test
	public void testDifferenzMaximum1() {
		testeee = new Calculator();
		assertTrue(testeee.differenz(Double.MAX_VALUE, Double.MAX_VALUE) == 0);
	}

	@Test
	public void testDifferenzMaximum3() {
		testeee = new Calculator();
		assertTrue(testeee.differenz(Double.MAX_VALUE, 3) == Double.MAX_VALUE);
	}

	@Test
	public void testDifferenzMaximum2() {
		testeee = new Calculator();
		assertTrue(testeee.differenz(1, Double.MAX_VALUE) == -Double.MAX_VALUE);
	}

	@Test
	public void testDifferenzMinimum2() {
		testeee = new Calculator();
		assertTrue(testeee.differenz(Double.MIN_VALUE, 4) == -4);
	}
	
	@Test
	public void testQuotientMaximum1() {
		testeee = new Calculator();
		assertTrue(testeee.quotient(Double.MAX_VALUE, Double.MAX_VALUE) == 1);
	}

	@Test
	public void testQuotientMaximum2() {
		testeee = new Calculator();
		assertTrue(testeee.quotient(Double.MAX_VALUE, 4) == Double.MAX_VALUE / 4);
	}

	@Test
	public void testQuotientMaximum3() {
		testeee = new Calculator();
		assertTrue(testeee.quotient(44, Double.MAX_VALUE) == 44 / Double.MAX_VALUE);
	}
	
	
	
	//Summierung, alle möglichkeiten
	
	@Test
	public void testSummeZweiPositiveOk() {
		testeee = new Calculator();
		assertTrue(testeee.summe(10,25)== 35);
	}

	@Test
	public void testSummePosNeg()   {
		testeee = new Calculator();
		assertTrue(testeee.summe(25, -10) == 15);
	}

	@Test
	public void testSummeNegPos()   {
		testeee = new Calculator();
		assertTrue(testeee.summe(-25, 10) == -15);
	}

	@Test
	public void testSummeNegNeg()   {
		testeee = new Calculator();
		assertTrue(testeee.summe(-25, -10) == -35);
	}


	// Differenz, alle möglichkeiten
	
	@Test
	public void testSubthraktionZweiPositiveOk() {
		testeee = new Calculator();
		assertTrue(testeee.differenz(25, 5)== 20);
	}

	@Test
	public void testDifferenzPosNeg() {
		testeee = new Calculator();
		assertTrue(testeee.differenz(25, -10) == 35);
	}

	@Test
	public void testDifferenzNegPos() {
		testeee = new Calculator();
		assertTrue(testeee.differenz(-25, 10) == -35);
	}

	@Test
	public void testDifferenzNegNeg() {
		testeee = new Calculator();
		assertTrue(testeee.differenz(-25, -10) == -15);
	}


	//Multiplikation, alle Möglichkeiten
	
	@Test
	public void testMultiplicationZweiPositiveOk() {
		testeee = new Calculator();
		assertTrue(testeee.produkt(8, 125)== 1000); 
	}
	
	@Test
	public void testMultiplicationPosNeg() {
		testeee = new Calculator();
		assertTrue(testeee.produkt(2, -2)== -4); 
	}
	
	@Test
	public void testMultiplicationNegPos() {
		testeee = new Calculator();
		assertTrue(testeee.produkt(-2, 2)== -4); 
	}
	
	@Test
	public void testMultiplicationNegNeg() {
		testeee = new Calculator();
		assertTrue(testeee.produkt(-2, -2)== 4); 
	}
	

	//Division, alle Möglichkeiten
	
	@Test
	public void testDivisionZweiPositiveOk() {
		testeee = new Calculator();
		assertTrue(testeee.quotient(10, 2)== 5);
	}

	@Test
	public void testDivisionPosNeg() {
		testeee = new Calculator();
		assertTrue(testeee.quotient(4, -2) == -2);
	}

	@Test
	public void testDivisionNegPos() {
		testeee = new Calculator();
		assertTrue(testeee.quotient(-4, 2) == -2);
	}

	@Test
	public void testDivisionNegNeg() {
		testeee = new Calculator();
		assertTrue(testeee.quotient(-4, -2) == 2);
	}

}

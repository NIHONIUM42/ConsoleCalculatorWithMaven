package ch.bbw.consolecalculator;

/*
 * Calculator
 * - kann zwei Zahlen addieren
 * 
 * @author Jovan Bühler
 * @version 0.0.1
 */

public class Calculator {
	
	public int summe(int summand1, int summand2) {
		return summand1 + summand2;
	}
	
	public int differenz(int minuend, int subtrahend) {
		return minuend - subtrahend;
	}
	
	public int produkt(int faktor1, int faktor2) {
		return faktor1 * faktor2; 
	}
	
	public int quotient(int dividend, int divisor) {
		return dividend * divisor; 
	}
}

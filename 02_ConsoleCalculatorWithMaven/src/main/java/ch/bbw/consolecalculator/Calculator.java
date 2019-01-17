package ch.bbw.consolecalculator;

/*
 * Calculator
 * - kann zwei Zahlen addieren
 * 
 * @author Jovan Bühler
 * @version 0.0.1
 */

public class Calculator {
	
	public double summe(double summand1, double summand2) throws java.lang.ArithmeticException {
		long value = (long) summand1 + (long) summand2;
		if((value > Integer.MAX_VALUE)||(value < Integer.MIN_VALUE)) {
			throw new java.lang.ArithmeticException();
		}
		return summand1 + summand2;	
	}
	
	public double differenz(double minuend, double subtrahend) {
		return minuend - subtrahend;
	}
	
	public double produkt(double faktor1, double faktor2) {
		return faktor1 * faktor2; 
	}
	
	public double quotient(double dividend, double divisor) {
		if(dividend ==  0) {
			throw new ArithmeticException();
		}else {
		return dividend / divisor;
		}
	}
}

package ch.bbw.consolecalculator;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        
        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println();
        

        System.out.println("Welcome to Java Calculator v0.1 by Jovan Bühler \n");
        Scanner scanner = new Scanner(System.in);

        Boolean x = false;
        
        Double result = 0.0;
        
        while(x == false) {
        	
        	if (result != 0.0) {

        	}
        	else {

	        	if(result == 0.0) {
		        System.out.println("First value: ");
		        int w = scanner.nextInt();
		        result = Double.valueOf(w);
		        
	        	}
	        	else{
	        		System.out.println("First value: " + result);
	        	}
        	}
	        	
	        System.out.println("Select between: + - * /");
	        String operation = scanner.next();
	        
	        System.out.println("Next value: ");
	        int v = scanner.nextInt();
	        Double value = Double.valueOf(v);
	        

	        if(operation.equals("+")) {  
	        	System.out.println("Summe, " + result + " + " + value + " = " + calculator.summe(result, value));
	        	result = calculator.summe(result, value);
	        }
	        else if(operation.equals("-")){
	        	System.out.println("Differenz, " + result + " - " + value + " = " + calculator.differenz(result, value));
	        	result = calculator.differenz(result, value);
	        }
	        else if(operation.equals("*")){
	        	System.out.println("Produkt, " + result + " * " + value + " = " + calculator.produkt(result, value));
	        	result = calculator.produkt(result, value);
	        }
	        else if (operation.equals("/")){
	        	System.out.println("Quotient, " + result + " / " + value + " = " + calculator.quotient(result, value));
	        	result = calculator.quotient(result, value);
	        }
	        else {
	        	System.out.println("\n Ihre Eingabe war ungültig. Versuchen Sie es nochmal. \n");
	        }
	        
        	System.out.println("Do you want to keep calculating? (y/n)");
        	String s = scanner.next();
        	if (s.equals("n")){ 
        		x = true;
        	}	
        }
        
    	System.out.println("\n Das Endresultat ist: " + result);
    	scanner.close();
    }
}

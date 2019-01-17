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
        

        System.out.println(" Welcome to Java Calculator v0.1 \n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n For now this calculator only supports operations with 1 operator and 2 numbers. \\n");
        System.out.print("\n First number: ");
        Double value1 = scanner.nextDouble();
        System.out.println("\n Select between: * / + -");
        String operation = scanner.next();
        System.out.print("\n Second number: ");
        Double value2 = scanner.nextDouble();

        
        if(operation == "+") {  
        	System.out.println("Summe " + value1 + " + " + value2 + " = " + calculator.summe(value1, value2));
        }
        else if(operation == "-"){
        	System.out.println("Differenz " + value1 + " + " + value2 + " = " + calculator.differenz(value1, value2));
        }
        else if(operation == "*"){
        	System.out.println("Summe " + value1 + " + " + value2 + " = " + calculator.produkt(value1, value2));
        }
        else if (operation == "/"){
        	System.out.println("Summe " + value1 + " + " + value2 + " = " + calculator.quotient(value1, value2));
        }
        else {
        	System.out.println("Ihre Eingabe war ungültig. Versuchen Sie es nochmals.");
        }
        
        scanner.close();
    }
}

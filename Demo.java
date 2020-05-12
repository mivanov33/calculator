package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
	private static Scanner scanner = new Scanner(System.in);
	private static double result;
    public static void main(String[] args) {
        System.out.println("Type in two numbers and the desired operation:");
        double firstVal = 0;
        double secondVal = 0;
        char operation = 0;
        
        try {
            firstVal = scanner.nextDouble();
            secondVal = scanner.nextDouble();
            operation = scanner.next().charAt(0);
        } catch (InputMismatchException ime) {
        	ime.printStackTrace();
        }
        
        Calculator calculator = new Calculator();
        result = calculator.calculate(firstVal, secondVal, operation);
        System.out.println("The result is: " + result);
    }
}
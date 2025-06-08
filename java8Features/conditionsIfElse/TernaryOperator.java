package conditionsIfElse;

import java.util.Scanner;

public class TernaryOperator {

	/**
	 * The ternary operator evaluates the condition. 
	 * If it's true, it assigns value_if_true to the variable;
	 *  otherwise, it assigns value_if_false.
	 */
	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number to check  -> : ");
        int number = scanner.nextInt();
        
        String result = "";
        
        // Write your code below
        result = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
        
        System.out.println("The number is " + result);
        scanner.close();
    }
}
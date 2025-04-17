package conditionsIfElse;

import java.util.Scanner;

public class IfElsePart2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Don't change this line
		System.out.println("Enter the first number  -> ");
		int n1 = scanner.nextInt(); // Don't change this line
		System.out.println("Enter the second number  -> ");
		int n2 = scanner.nextInt(); // Don't change this line
		System.out.println("Enter the logical operator  -> ");
		scanner.nextLine(); // Don't change this line

		String op = scanner.nextLine(); // Don't change this line

		// Write your code below
		double result = 0;
		if (op.equals("+")) {
			result = n1 + n2;
		} else if (op.equals("-")) {
			result = n1 - n2;
		} else if (op.equals("/")) {
			result = n1 / n2;
		} else if (op.equals("*")) {
			result = n1 * n2;
		}
		System.out.println(result);
	}
}

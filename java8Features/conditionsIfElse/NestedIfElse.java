package conditionsIfElse;

import java.util.Scanner;

public class NestedIfElse {

	/**
	 * Create a program that checks if someone can ride a roller coaster. The
	 * requirements are:
	 * 
	 * Must be at least 12 years old Must be taller than 150cm 
	 * If they meet both requirements but are under 15, they need adult supervision 
	 * 
	 * Print exactly these messages for each case:
	 * 
	 * If too young: Sorry, you're too young 
	 * If not tall enough: Sorry, you're not
	 * tall enough If under 15 and no adult: Sorry, you need an adult with you 
	 * If under 15 with adult: You can ride with adult supervision! 
	 * If 15 or older and tall enough: You can ride by yourself!
	 * 
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Age  -> ");
		int age = scanner.nextInt(); // Don't change this line
		System.out.println("Enter Height  -> ");
		int height = scanner.nextInt(); // Don't change this line
		System.out.println("Are you with adult  -> ");
		boolean hasAdult = scanner.nextBoolean(); // Don't change this line

		// Write your code below
		if (age >= 12) {
			if (height > 150) {
				if (age < 15) {
					if (hasAdult) {
						System.out.println("You can ride with adult supervision!");
					} else {
						System.out.println("Sorry, you need an adult with you");
					}
				} else {
					System.out.println("You can ride by yourself!");
				}
			} else {
				System.out.println("Sorry, you're not tall enough");
			}
		} else {
			System.out.println("Sorry, you're too young");
		}

		scanner.close();
	}
}

package loop;

import java.util.Scanner;

public class WhileLoopPart2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :");

		double input = Double.parseDouble(scanner.nextLine());
		while (input >= 3.5) {
			input /= 2;

		}
		System.out.println(input);
		scanner.close();

	}
}
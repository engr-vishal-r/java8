package loop;

public class DoWhileLoopPart3 {

	public static void main(String[] args) {
		// Initialize variables
		int sum = 0;
		int number = 1;

		// Your code here
		do {

			sum += number;
			number += 2;
			System.out.println("Sum is: " + sum);
			System.out.println("Num is: " + number);
		} while (number <= 50);

		// Print the final sum
		System.out.println("Final Sum: " + sum);
	}
}

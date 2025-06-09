package streams;

import java.util.*;

public class TerminalOperations {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2, 3, 4, 5);

		// Sum of squares
		int sum = nums.stream()
		    .map(x -> x * x)
		    .reduce(0, Integer::sum);

		System.out.println(sum);

	}
}

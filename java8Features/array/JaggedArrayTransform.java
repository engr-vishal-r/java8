package array;

import java.util.ArrayList;
import java.util.List;

public class JaggedArrayTransform {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int[][] input = { { 1, 1 }, { 1, 2, 3 }, { 1, 2, 3, 4 } };

		List<Integer> result = new ArrayList<>();

		// First array
		result.add(input[0][0]);

		// Second array
		int sum = 0;
		for (int j = 1; j < input[1].length; j++) {
			result.add(input[1][j]);
			sum += input[1][j];
		}
		result.add(sum);

		// Third array
		for (int j = 2; j < input[2].length; j++) {
			result.add(input[2][j]);
		}

		System.out.println(result);
		long endTime = System.nanoTime();

		System.out.println("Total Time Taken : " + (endTime - startTime));
	}
}

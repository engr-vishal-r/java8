package collectorsAPI;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JaggedArrayTransform {
	
    public static void main(String[] args) {
    	long startTime = System.nanoTime();
        int[][] input = {
            {1, 1},
            {1, 2, 3},
            {1, 2, 3, 4}
        };

        List<Integer> result = IntStream.range(0, input.length)
            .flatMap(i -> {
                int[] arr = input[i];
                if (i == 0) {
                    return IntStream.of(arr[0]); // Keep only first element
                } else if (i == 1) {
                    int sum = Arrays.stream(arr).sum();
                    return IntStream.concat(
                        Arrays.stream(arr, 1, arr.length), // Skip first element
                        IntStream.of(sum - arr[0])         // Sum minus first element
                    );
                } else {
                    return Arrays.stream(arr, 2, arr.length); // Skip first two elements
                }
            })
            .boxed()
            .collect(Collectors.toList());

        System.out.println(result);
        long endTime = System.nanoTime();
        
        System.out.println("Total Time Taken : " + (endTime-startTime));
    }
}

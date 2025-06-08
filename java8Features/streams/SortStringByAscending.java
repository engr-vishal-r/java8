package streams;

import java.util.Arrays;
import java.util.List;

public class SortStringByAscending {

	public static void main(String[] args) {

		long startTime = System.nanoTime();

		// List
		List<String> names = List.of("Vishal", "jain", "ramesh", "suresh", "arun");

		names.stream().sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::println);

		// Array
//	String name [] = {"Vishal", "jain", "ramesh", "suresh", "arun"};
//	
//	Arrays.stream(name).sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::println);

		long endTime = System.nanoTime();
		long timetaken = endTime - startTime;
		System.out.println("timetaken -> " + timetaken);
	}

}
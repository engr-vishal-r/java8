package sortingStaticExp;

import java.util.*;

public class SortStaticDemo {

	/**
	 * Below are some of the observations about the static methods of interfaces:
	 * 
	 * Static methods in interfaces help to provide utility methods. For example, null check, collection sorting, etc
	 * 
	 * Methods of java.lang.Object can never be defined as static methods in interfaces
	 * 
	 * The Comparator interface of Java 8 is a perfect example in which the static
	 * methods have been included: comparingInt(), comparingDouble(),
	 * comparingLong(), naturalOrder(), nullsFirst(), nullsLast() and reverseOrder()
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		List<String> countrylst = Arrays.asList("India", "America", "Japan", "america", "Brazil");
		countrylst.sort(Comparator.comparing(String::toLowerCase)); 
		Collections.reverse(countrylst); // will sort in String reverse sorting order
		//countrylst.sort(Comparator.comparing(String::toLowerCase)); // will sort in String natural sorting order case in-sensitive
		//countrylst.sort(Comparator.naturalOrder()); // will sort in String natural sorting order
		for (String countryName : countrylst) {
			System.out.println(countryName);
		}
		
		long endTime = System.nanoTime();
		long timetaken = endTime - startTime;
		System.out.println("timetaken -> " + timetaken);
	}
}

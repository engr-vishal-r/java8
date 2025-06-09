package collectorsAPI;

import java.util.*;
import java.util.stream.Collectors;

public class CountString {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Paul", "George", "John");

		Map<String, Long> countMap = names.stream()
		    .collect(Collectors.groupingBy(name -> name, Collectors.counting()));

		System.out.println(countMap); 

	}
}

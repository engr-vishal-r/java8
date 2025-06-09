package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringStartsWithA {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Ambur");

		// Filter names starting with 'A', sort them, convert to uppercase
		List<String> result = names.stream().filter(name -> name.startsWith("A")).map(String::toUpperCase).sorted()
				.collect(Collectors.toList());

		System.out.println(result);
	}
}

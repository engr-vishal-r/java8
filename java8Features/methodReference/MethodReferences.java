package methodReference;

import java.util.*;

public class MethodReferences {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c");

		// Lambda
		list.forEach(s -> System.out.println(s));

		// Method Reference
		list.forEach(System.out::println);

	}

}

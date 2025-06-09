package optional;

import java.util.Optional;

public class OptionalExp {

	public static void main(String[] args) {

		Optional<String> name = Optional.of("John");

		if (name.isPresent()) {
			System.out.println(name.get());
		}

		// or more cleanly:
		name.ifPresent(System.out::println);

		// With default
		String result = name.orElse("Default Name");
		System.out.println(result);
	}
}
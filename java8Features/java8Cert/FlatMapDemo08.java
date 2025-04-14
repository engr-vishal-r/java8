package java8Cert;

import java.util.Optional;

public class FlatMapDemo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional.ofNullable(null)
		.flatMap(x->x!=null?Optional.of("java"):Optional
				.of("Certificate")).map(String::toLowerCase)
		.ifPresent(System.out::println);
	}

}

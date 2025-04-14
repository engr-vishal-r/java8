package java8Cert;

import java.util.stream.IntStream;

public class LambdaDemo09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream.rangeClosed(-3, -1).forEach(System.out::print);
		IntStream.rangeClosed(1, 3).forEach(System.out::print);

	}

}

package java8Cert;

import java.util.function.Predicate;

public class Predicate02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate <String> p1 = s -> s.isEmpty();
		System.out.println(p1.test(""));

		Predicate <String> p2 = x -> ((String)x).isEmpty();
		System.out.println(p2.test(""));

	}

}
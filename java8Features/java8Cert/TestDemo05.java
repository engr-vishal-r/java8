package java8Cert;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestDemo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set student = new TreeSet<>();
		student.add("John");
		student.add("Jack");
		student.add("John");
		student.add("Jack");
		student.forEach(name ->System.out.println(name));
		
	}

}

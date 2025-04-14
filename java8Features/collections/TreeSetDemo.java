package collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
//if a set is required to have sorted elements, we can use a TreeSet.
		
//  Creating a new TreeSet object
		Set<String> courseSet = new TreeSet<>();

//  Adding elements to the Set
		courseSet.add("Java");
		courseSet.add("Hibernate");
		courseSet.add("Angular JS");

//  Iterating over the set using enhanced for loop
		for (String s : courseSet) {
			System.out.println(s);
		}
	}
}

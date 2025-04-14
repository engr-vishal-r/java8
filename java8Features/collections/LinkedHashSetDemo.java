package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

class LinkedHashSetDemo {

	public static void main(String[] args) {
		// Creating a new Set object of type Integer
		Set<Integer> numberSet = new LinkedHashSet<>();

		// Adding elements to the set
		numberSet.add(12);
		numberSet.add(24);
		numberSet.add(12);

		// Displaying the Set
		System.out.println(numberSet);
		
		// Creating an iterator over the set
		Iterator iter = numberSet.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}

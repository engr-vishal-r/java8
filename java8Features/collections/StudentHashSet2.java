package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentHashSet2 {

	public static void main(String[] args) {
		 Set<StudentHashSet1> studentSet = new LinkedHashSet<>();
		 

		studentSet.add(new StudentHashSet1("Charlie", 101));
		studentSet.add(new StudentHashSet1("Bob", 102));
		studentSet.add(new StudentHashSet1("Alba", 101)); // Duplicate rollNumber

		for (StudentHashSet1 student : studentSet) {
			System.out.println(student);
		}
	}
}

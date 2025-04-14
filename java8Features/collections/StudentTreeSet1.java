package collections;

import java.util.TreeSet;

public class StudentTreeSet1 implements Comparable<StudentTreeSet1> {
	    private String name;
	    private int rollNumber;

	    public StudentTreeSet1(String name, int rollNumber) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getRollNumber() {
	        return rollNumber;
	    }

	    public void setRollNumber(int rollNumber) {
	        this.rollNumber = rollNumber;
	    }

	    @Override
	    public int compareTo(StudentTreeSet1 otherStudent) {
	        return Integer.compare(this.rollNumber, otherStudent.rollNumber);
	    }

	    @Override
	    public String toString() {
	        return "Student{" +
	                "name='" + name + '\'' +
	                ", rollNumber=" + rollNumber +
	                '}';
	    }

	    public static void main(String[] args) {
	        TreeSet<StudentTreeSet1> studentSet = new TreeSet<>();
	        
	        studentSet.add(new StudentTreeSet1("Charlie", 101));
	        studentSet.add(new StudentTreeSet1("Bob", 102));
	        studentSet.add(new StudentTreeSet1("Charlie", 101)); // Duplicate rollNumber
	       // studentSet.add(new StudentTreeSet1("Doggy", null)); //treeset doesn't allow the null element
	        
	        for (StudentTreeSet1 student : studentSet) {
	            System.out.println(student);
	        }
	    }
	}


package collections;

import java.util.Objects;

public class StudentHashSet1 {

	    private String name;
	    private int rollNumber;

	    public StudentHashSet1(String name, int rollNumber) {
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
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        StudentHashSet1 student = (StudentHashSet1) o;
	        return rollNumber == student.rollNumber;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(rollNumber);
	    }

	    @Override
	    public String toString() {
	        return "Student{" +
	                "name='" + name + '\'' +
	                ", rollNumber=" + rollNumber +
	                '}';
	    }
	}


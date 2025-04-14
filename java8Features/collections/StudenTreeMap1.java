package collections;

public class StudenTreeMap1 {

	    private String rollNumber;
	    private String name;
	    private int totalMarks;

	    public StudenTreeMap1 (String rollNumber, String name, int totalMarks) {
	        this.rollNumber = rollNumber;
	        this.name = name;
	        // Ensure totalMarks is not greater than 100
	        this.totalMarks = Math.min(totalMarks, 100);
	    }

	    // Getter methods for rollNumber, name, and totalMarks

	    public String getRollNumber() {
	        return rollNumber;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getTotalMarks() {
	        return totalMarks;
	    }

	    // Method to calculate the grade based on total marks
	    public String calculateGrade() {
	        if (totalMarks >= 60) {
	            return "A";
	        } else if (totalMarks > 40) {
	            return "B";
	        } else {
	            return "C";
	        }
	    }

	    @Override
	    public String toString() {
	        return "Student{" +
	                "rollNumber='" + rollNumber + '\'' +
	                ", name='" + name + '\'' +
	                ", totalMarks=" + totalMarks +
	                '}';
	    }
	}

	

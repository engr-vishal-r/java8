package collections;

public class StudentMapInterface1 {
	
	String courseName;

	public StudentMapInterface1(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return courseName;
	}


}

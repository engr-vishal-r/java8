package staticBlockExp;

public class Student {

	private int studentId;
	private String studentName;
	private String snack;
	private static int count;

	/**
	 * Static block will run only once at class load time but constructor runs
	 * everytime when the object is created Static block is also called static
	 * intialization block to initialize the static variables to use in constructors
	 * like if,switch etc.)
	 */
	static {
		count = 1000;
		System.out.println("Message from static block: class is loaded.. ");
	}

	public Student() {
		System.out.println("Object Instantiated.... ");
		studentId = ++count;
	}

	public static int getCountValue() {
		// System.out.println(studentId); //can't access non-static variables inside
		// static method
		return count;
	}

	public void testStatic() {
		System.out.println(count);
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getSnack() {
		return snack;
	}

	public void setSnack(String snack) {
		this.snack = snack;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}

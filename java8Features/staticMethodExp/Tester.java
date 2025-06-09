package staticMethodExp;

public class Tester {
	
	/**
	 * JVM invokes the main method as tester.main to call it
	 * Static method can be invoked by using class name or class reference
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int initialValue = Student.getCountValue();
		System.out.println("Initial value of Student Counter is : "+ initialValue);
	}

}

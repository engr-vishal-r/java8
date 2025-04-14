package exceptions;

public class AssertKeyword {

	
//	public static void divide(int m, int n) {
//		if (n == 0) {
//			throw new IllegalArgumentException("The n value Should not be null");
//		} else {
//			int z = m / n;
//			System.out.println(z);
//		}
//	}
//
//	public static void main(String[] args) {
//		divide(10, 5);
//	}
//}

/**
 * the above boilerplate code can be simplified and written like this below code
 */
	
	public static void divide(int m, int n) {
		assert n != 0 : "The 'n' value should not be zero";
		int z = m / n;
		System.out.println(z);
		
	}

	public static void main(String[] args) {
		divide(10, 5);

	}
}

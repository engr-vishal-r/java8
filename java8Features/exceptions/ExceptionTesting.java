package exceptions;

public class ExceptionTesting {

		public static void display() throws UserDefinedException{
			System.out.println("Inside Display");
			throw new UserDefinedException("Error thrown");
		}
		public static void main(String[] args) throws UserDefinedException  {
//			display();
			System.out.println("Inside Main");
		}
	}

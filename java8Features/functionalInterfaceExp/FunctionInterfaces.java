package functionalInterfaceExp;

public class FunctionInterfaces {

	@FunctionalInterface
	interface Calculator {
		int operate(int a, int b);
	}

	public static void main(String[] args) {

		// Using Lambda
		Calculator add = (a, b) -> a + b;
		System.out.println(add.operate(5, 3)); 
	}
}

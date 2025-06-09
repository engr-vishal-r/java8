package lambdaExpressionsExp;

public class LamdaExpDemo {

	public static void main(String[] args) {
		
	// Without Lambda
	Runnable r1 = new Runnable() {
	    public void run() {
	        System.out.println("Hello from Runnable!");
	    }
	};

	// With Lambda
	Runnable r2 = () -> System.out.println("Hello from Lambda Runnable!");

	r1.run();
	r2.run();
	}

}

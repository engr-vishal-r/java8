package defaultMethod;

class DefaultStarter extends Greet implements Greeting, GreetingExtn{
	   public static void main(String[] args) {
		    new DefaultStarter().hello();
	   }
	}

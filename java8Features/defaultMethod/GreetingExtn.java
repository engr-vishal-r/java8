package defaultMethod;

interface GreetingExtn extends Greeting{
    default void hello() {
	System.out.println(" hello from GreetingExtn");
     }
}



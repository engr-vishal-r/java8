package defaultMethod;

interface Greeting{
    default void hello() {
	System.out.println(" hello from Greeting");
    }
}


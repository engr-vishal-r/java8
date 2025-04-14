package streams;

import java.util.Arrays;

public class StreamCubeDemo {

	    public static void main(String pars[]) {
	        int no [] = { 1,2,3,4,5};
	        Arrays.stream(no)
	            .map(n -> n*n*n)
	            .forEach(n -> System.out.print(n +", "));
	    }
	}
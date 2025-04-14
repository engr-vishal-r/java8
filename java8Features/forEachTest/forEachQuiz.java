package forEachTest;

import java.util.List;

public class forEachQuiz {
		public static void main(String[] args) {
	        List<Integer> list = List.of(4,5,6,7,3,9);
	        
	        list.stream().filter(n -> n % 3 == 0).map(n -> n * n)
	        .forEach(System.out::println);
	    }
	}


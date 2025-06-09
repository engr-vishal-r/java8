package functionalInterfaceExp;

import java.util.function.BiFunction;

public class BiFunctionDemo {
    //main
    public static void main (String pars[]) {
    	 int num1 = 10;
         int num2 = 5;
    	BiFunction<Integer, Integer, Integer> addition = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> subtraction = (a, b) -> a - b;
        BiFunction<Integer, Integer, Integer> multiplication = (a, b) -> a * b;

        System.out.println("Addition: " + evaluate(num1, num2, addition));
        System.out.println("Subtraction: " + evaluate(num1, num2, subtraction));
        System.out.println("Multiplication: " + evaluate(num1, num2, multiplication));
    }

    public static Integer evaluate(Integer t, Integer u, BiFunction<Integer, Integer, Integer> fn) {
        return fn.apply(t, u);
    }
}

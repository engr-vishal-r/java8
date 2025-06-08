package conditionsIfElse;

import java.util.Scanner;


public class IfElsePart1 {

	/**
	 * task is to initialize variable status based on the conditions:

"Calm" if wind is smaller than 8,
"Breeze" if wind is between 8 and 31 (including 8 and 31).
"Gale" if wind is between 32 and 63 (including 32 and 63)
"Storm" otherwise
	 */
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number :  -> ");
        int wind = scanner.nextInt(); 
        String status = "unset";
        // Type your code below
        if(wind < 8){
            status = "Calm";
        }else if (wind >=8 && wind <=31){
            status = "Breeze";
        }else if (wind >=32 && wind <=63){
            status ="Gale";
        }else {
            status ="Storm";
        }
        
        
        System.out.println("status = " + status);
        scanner.close(); 
    }
}

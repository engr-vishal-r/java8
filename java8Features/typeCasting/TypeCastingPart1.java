package typeCasting;

import java.util.Scanner;

public class TypeCastingPart1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code below
        int years = 120;
        System.out.println("Enter your age -> ");

        String ipAge = scanner.nextLine(); 
        int intAge =Integer.parseInt(ipAge);
        int remainingYears = (years - intAge);
        System.out.println(remainingYears + " years till 120");

    }
}
package switchStatement;

import java.util.Scanner;

public class SwitchStatement2 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the month (1–12): ");
	        int month = scanner.nextInt();

	        String season = switch (month) {
	            case 1, 2, 12 -> "Winter";
	            case 3, 4, 5  -> "Spring";
	            case 6, 7, 8  -> "Summer";
	            case 9, 10, 11 -> "Autumn";
	            default -> "Invalid month";
	        };

	        System.out.println(season);
	    }
	}
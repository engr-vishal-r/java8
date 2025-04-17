package switchStatement;

import java.util.Scanner;

public class SwitchStatement1 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month (1-12) -> : ");
        int month = scanner.nextInt();
        String season = "";
        
        // Write your code below
        switch(month){
            case 1:
            case 2:
            case 12:
            season="Winter";
            break;            
            case 3:
            case 4:
            case 5:
            season="Spring";
            break;
            case 6:
            case 7:
            case 8:
            season="Summer";
            break;
            case 9:
            case 10:
            case 11:
            season="Autumn";
            break;
            default:
            season="Invalid month";

        }
        
        System.out.println(season);
    }
}
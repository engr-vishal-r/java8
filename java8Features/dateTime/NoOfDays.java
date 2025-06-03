package dateTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class NoOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the start date  ->");
		String startDateStr = scanner.next();
		System.out.print("Enter the end date  ->");
		String endDateStr = scanner.next();
		
		System.out.println();

		LocalDate startDate = LocalDate.parse(startDateStr);
		LocalDate endDate = LocalDate.parse(endDateStr);
		
		long totalNumOfDays = ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println("Total Number Of Days  ->  " +  totalNumOfDays);
	}

}

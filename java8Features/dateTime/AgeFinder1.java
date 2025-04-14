package dateTime;

import java.time.LocalDate;

public class AgeFinder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgeFinder ageFinder = new AgeFinder();
		
		LocalDate dob = LocalDate.of(1995, 05, 02);
		
		System.out.println(
				"Current age --> " + ageFinder.getAge(dob));
		
		int noOfDays = 7;
	
		System.out.println("Future day --> " + ageFinder.getDateAfterNDays(noOfDays));
		
		int year=1;
		int month = 0;
		int day= 0;
		
		System.out.println("Future X days --> " + ageFinder.getDateAfterXYearYMonthZDays(year, month, day));


	}

}

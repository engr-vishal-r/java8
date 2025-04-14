package dateTime;

import java.time.LocalDate;
import java.time.Period;

public class AgeFinder {
	
	public int getAge(LocalDate dateOfBirth) {
		LocalDate currentDate = LocalDate.now();
		Period age = Period.between(dateOfBirth, currentDate);
		return age.getYears();
	}

	public LocalDate getDateAfterNDays(int noOfDays) {
		LocalDate currentDate = LocalDate.now();
		LocalDate futureDate = currentDate.plusDays(noOfDays);
		return futureDate;
	}

	public LocalDate getDateAfterXYearYMonthZDays(int year, int month, int day) {
		LocalDate currentDate = LocalDate.now();
		LocalDate futureDate = currentDate.plusYears(year).plusMonths(month).plusDays(day);
		return futureDate;
	}
}

package dateTime;

import java.time.LocalDate;
import java.time.Period;

public class EmployeeServiceDemo {

	public static long calculateLOPs(LocalDate startDateLOP, LocalDate endDateLOP) {
		Period period = Period.between(startDateLOP, endDateLOP);
		int lops = period.getDays();
		return lops + 1;
	}

	public static void main(String[] args) {
		LocalDate startDateLOP = LocalDate.of(2023, 9, 10);
		LocalDate endDateLOP = LocalDate.of(2023, 9, 18);

		System.out.println(calculateLOPs(startDateLOP, endDateLOP));
	}
}

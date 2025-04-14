package java8Cert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocaleDemo17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate admDate = LocalDate.now();
		LocalDate lastDate = admDate.plusDays(3).minusWeeks(2).plusMonths(2);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		System.out.println(lastDate.format(dtf));
	}

}

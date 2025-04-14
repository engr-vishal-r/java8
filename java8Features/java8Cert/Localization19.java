package java8Cert;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class Localization19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date startDate = new Date();
		Date date1 = startDate;
		date1.setDate(15);
		System.out.println(date1);
		
		LocalDate localDate1 = LocalDate.of(2018, Month.MARCH, 15);
		LocalDate localDate2 = localDate1;
		localDate1 = localDate1.plusDays(20);
		System.out.println(localDate2);
		System.out.println(localDate1);
	}

}

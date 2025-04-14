package java8Cert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateDemo16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		LocalDate admissionDate = LocalDate.now();
		System.out.println(admissionDate.format(dtf));
		LocalDate lastDate = admissionDate.plusDays(3).minusWeeks(2).plusMonths(2);
        System.out.println(lastDate.format(dtf));
        if(admissionDate.isAfter(lastDate)) {
        	System.out.println(" please complete the admission asap");
        }else {
        	System.out.println(" sorry, better luck next time");
        }
	}

}

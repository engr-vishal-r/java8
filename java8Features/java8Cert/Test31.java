package java8Cert;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Test31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE", Locale.US);
		System.out.println(formatter.format(LocalDateTime.now()));

	}

}

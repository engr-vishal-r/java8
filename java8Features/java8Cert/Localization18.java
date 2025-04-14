package java8Cert;

import java.text.DateFormat;
import java.util.Locale;

public class Localization18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale locale = Locale.US;
		DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT,locale);
		System.out.println(df.getInstance().getCalendar().getFirstDayOfWeek());

	}

}

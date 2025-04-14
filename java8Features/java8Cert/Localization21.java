package java8Cert;

import java.text.NumberFormat;
import java.util.Locale;

public class Localization21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer var = 67_987_567;
		Locale locale = Locale.US;

		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		System.out.println(String.format("Locale: %s; currency: %s", locale, nf.format(var)));
	}

}

package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TraversingList {

	public static void main(String[] args) {
		List<String> listCountries = Arrays.asList("France", "Germany", "Italy", "Egypt");
		listCountries.sort((String stringArg1, String stringArg2) -> stringArg1.compareTo(stringArg2));
//		for (String countryName : listCountries) {
//			System.out.println(countryName);
//		}
		Collections.reverse(listCountries); // to printin descending order
		listCountries.forEach(countryName -> System.out.println(countryName));
	}
}

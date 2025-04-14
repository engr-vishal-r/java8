package java8Cert;

import java.util.*;

public class LocalizationDemo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale locale = new Locale("fr", "fr");
		System.out.println("Locale country: " + locale.getCountry());
		System.out.println("Locale language: " + locale.getLanguage());
		System.out.println("Locale displaylanguage : " + locale.getDisplayLanguage());
		System.out.println("Locale displayname: " + locale.getDisplayName());
		
	}

}

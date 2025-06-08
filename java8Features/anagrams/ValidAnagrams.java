package anagrams;

import java.util.Arrays;

public class ValidAnagrams {

	// Function to check if two strings are anagrams
	static boolean areAnagrams(String s1, String s2) {

		// Sort both strings
		char[] s1Array = s1.toCharArray();
		char[] s2Array = s2.toCharArray();
		Arrays.sort(s1Array);
		Arrays.sort(s2Array);

		// Compare sorted strings
		return Arrays.equals(s1Array, s2Array);
	}

	public static void main(String[] args) {
		String s1 = "vishal";
		String s2 = "ashivl";
		String result = "";

		if (areAnagrams(s1, s2) == true) {
			result = "Anagrams";
		} else {
			result = "Not Anagrams";
		}

		System.out.println("Given Strings " + s1 + " and " + s2 + " are " + result);
	}
}
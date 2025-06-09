package collectorsAPI;

import java.util.stream.Collectors;

public class CheckAnagrams {
	static boolean areAnagrams(String s1, String s2) {
		// Use Streams to sort and collect back to String
		String sortedS1 = s1.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());

		String sortedS2 = s2.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());

		return sortedS1.equals(sortedS2);
	}

	public static void main(String[] args) {
		String s1 = "geeks";
		String s2 = "kseeg";
		System.out.println(areAnagrams(s1, s2));

	}
}

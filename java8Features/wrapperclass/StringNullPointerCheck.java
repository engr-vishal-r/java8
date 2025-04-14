package wrapperclass;

public class StringNullPointerCheck {
	public static void main(String[] args) {
		String input = "352486749";
		String formattedPhonenumber = formatPhone(input);
		System.out.println(formattedPhonenumber);
	}

	public static String formatPhone(String input) {
		if (input != null && input.trim().length() == 9) {
			StringBuilder formatted = new StringBuilder(input);
			formatted = formatted.insert(0, "+1(");
			formatted = formatted.insert(6, ")");
			formatted = formatted.insert(10, "-");

			return formatted.toString();

		}
		return null;

	}

}

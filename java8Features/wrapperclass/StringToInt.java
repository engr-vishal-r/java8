package wrapperclass;

public class StringToInt {

	public static void main(String[] args) {
		String contact = "288978";
		int contactNo = Integer.parseInt(contact);
		System.out.println(contactNo);
		int contactNos = contactNo;
		String contacttt = Integer.toString(contactNos);
		System.out.println(contacttt);
		if (contact.equals(contactNo)) {
			System.out.println("its equal");
		} else {
			System.out.println("Not equal");
		}
	}
}

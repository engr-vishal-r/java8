package assessment;

public class StringEquals {
	public static void main(String[] args) {
		
	String value1 = "Hello";
	String value2 = new String("Hello");
	
	System.out.println(value1 == value2);
	String value3 = value2.intern();
	System.out.println(value1 == value3);

}
}

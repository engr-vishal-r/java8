package logicalOperatorsCompare;

public class StringCompare {
    static String str1 = "hello";
    static String str2 = "hello";
    static String str3 = "Hello";

    public static void main(String[] args) {
        boolean result1 = str1.equals(str2);  // true
        boolean result2 = str1.equals(str3);// false (case-sensitive)
        boolean result3 = str1.equalsIgnoreCase(str3);// false (case-insensitive)
        System.out.println("Result1  : " +  result1);

        System.out.println("Result2  : " +  result2);
        System.out.println("Result2  : " +  result3);
    }


}


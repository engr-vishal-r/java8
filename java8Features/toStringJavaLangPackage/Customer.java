package toStringJavaLangPackage;

public class Customer {

    public void getName(String fame, String lname) {
        String name = fame.concat(lname);
        StringBuilder sb = new StringBuilder(fame);
        sb.append(" ");
        name = sb.toString();//Line 1
        System.out.println(name);
    }

    public static void main(String[] args) {
        Customer c = new Customer();
        c.getName("sam", "roy");
    }
}

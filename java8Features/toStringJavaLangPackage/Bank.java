package toStringJavaLangPackage;

public class Bank {
    public void checkUsername(String name) {
        String username = "infosys";
        if (name.equals(username)) {
            System.out.println("valid");
        }
        if (name == username) {
            System.out.println("valid");
        }
        if (name.equals(new String("infosys"))) {
            System.out.println("valid");
        }
        if (name == new String("infosys")) {
            System.out.println("valid");
        }
    }

    public static void main(StringClass[] args) {
        new Bank().checkUsername("infosys");//Line 1
    }
}


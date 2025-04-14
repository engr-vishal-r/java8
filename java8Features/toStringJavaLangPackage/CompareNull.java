package toStringJavaLangPackage;

public class CompareNull {
    public void compare(String shape) {
        if ("null".equals(shape)) { // line 5
            System.out.println("Hi");
        }
        if (shape.equals("null")) { // line 8 trying to compare null value will always throw nullPointerException
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        CompareNull t = new CompareNull();
        t.compare(null);
    }
}
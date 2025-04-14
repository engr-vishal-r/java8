package toStringJavaLangPackage;

public class ToString {
    public static void main(StringClass[] args) {
        Watch watch1 = new Watch(101, "Sports watch");
        Watch watch2 = new Watch(101, "Sports watch");

        System.out.println(watch1); //prints only objects
        System.out.println(watch1.tostring());
        System.out.println(watch2.tostring());
        System.out.println(watch1.equals(watch2));// equals all compares the value of the object we need to override the equals method
    }
}
package toStringJavaLangPackage;

public class HashCode {
    public static void main(String[] args) {
        Watch watch1 = new Watch (101,
                "Sports watch");
        Watch watch2 = new Watch (101, "Sports watch");
        System.out.println(watch1.hashCode());
        System.out.println(watch2.hashCode());
    }
}

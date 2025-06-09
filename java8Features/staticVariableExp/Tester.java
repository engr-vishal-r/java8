package staticVariableExp;

public class Tester {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Count After Student1: " + student1.getCount());
        Student student2 = new Student();
        System.out.println("Count After Student2: " + student2.getCount());
        Student student3 = new Student();
        System.out.println("Count After Student3: " + student3.getCount());
    }
}

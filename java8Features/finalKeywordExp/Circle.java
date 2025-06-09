package finalKeywordExp;

public class Circle {
    private double radius;
    private double area;
    private final double PI=3.14;

    public Circle(double r){
        radius = r;
    }
    public double findArea()
    {
        area=PI*radius*radius;
        return area;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(12);
        System.out.println("Area = "+ circle1.findArea() + " sq. units");
        Circle circle2 = new Circle(20);
        System.out.println("Area = "+ circle2.findArea() + " sq. units");

    }
}

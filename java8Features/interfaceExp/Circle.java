package interfaceExp;

public class Circle implements Shape {
    private double radius;

    /**
     * It is mandatory to implement the methods inside shape interface
     * @param radius
     */
    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public void displayArea() {
        System.out.println("Area of Circle:  " + Shape.PI *radius*radius);
    }
}

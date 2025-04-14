package interfaceDemo;

public class Rectangle implements Shape{
    private double length;
    private double breadth;

    /**
     * It is mandatory to implement the methods inside shape interface
     *
     */
    public Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    public void displayArea() {
        System.out.println("Area of Rectangle:  " + length*breadth);
    }
}


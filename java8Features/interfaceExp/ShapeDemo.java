package interfaceExp;

public class ShapeDemo {
    /**
     * interface shouldn't be instantiated at anytime
     * @param args
     */
    public static void main(String [] args){
        ShapeService.computeandDisplayArea(new Circle(12));
        ShapeService.computeandDisplayArea(new Rectangle(10,10));
    }
}

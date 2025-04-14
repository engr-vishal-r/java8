package finalKeywordDemo;

public class Parent {
    /**
     * Final method is to avoid method being overridden by any subclasses
     */
    public final void speak(){
        System.out.println("Parent class... ");
    }
}

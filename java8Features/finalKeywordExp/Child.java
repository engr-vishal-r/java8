package finalKeywordExp;

public class Child extends Parent {
    public void speak(){  //Error can't override final method
        System.out.println("Child class.... ");
    }
}

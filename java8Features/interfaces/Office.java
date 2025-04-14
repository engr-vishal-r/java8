package interfaces;

abstract class Office implements IBankTest {
    public void withdraw() {
        System.out.println("Amount withdrawal");
    }
}
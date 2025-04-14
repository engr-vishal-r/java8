package lambdaExpressionsDemo;

public class DemoThreadMine {
    public static void main(String pars[]) {
        Thread threadInstance = new Thread(new Runnable() {
            //run --- implementation
            public void run() {
                System.out.println(" Its me from thread");
            }
        });
        threadInstance.start();
    }
}


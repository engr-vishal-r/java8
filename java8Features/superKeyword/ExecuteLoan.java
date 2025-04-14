package superKeyword;

class ExecuteLoan{
    public static void main (String[] args) {
    	UsingSuperInConstructor2 loan = new UsingSuperInConstructor2();     //Runtime polymorphism
        double hloan = loan.calculateEMI(2000000);
        System.out.println("Home loan emi per year..." + hloan);
    }
}

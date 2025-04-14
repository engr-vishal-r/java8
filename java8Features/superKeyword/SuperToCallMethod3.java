package superKeyword;

public class SuperToCallMethod3 {
	    public static void main(String[] args) {
	    	SuperToCallMethod1 loan = null;
	        loan =  new SuperToCallMethod2();                 // Runtime polymorphism
	         double hloan = loan.calculateEMI(2000000);
	         System.out.println("Home loan emi per year..."+ hloan);
	    }
	}

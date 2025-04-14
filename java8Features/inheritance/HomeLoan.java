package inheritance;

public class HomeLoan extends Loan {
	
	HomeLoan(){
		tenure =5;  // reusing super class member variables
		principle =20000;
		interestRate = 8.5f;
		accountNumber = "Acc12345";
	}
	public static void main(String[] args) {
		HomeLoan loan = new HomeLoan();
		double amount = loan.calculateEMI(); //subclass object invoking superclass method
		System.out.println("emi per year....."+ amount);
	}

}

package methodOverriding;

public class HomeLoan extends Loan {
	//method overriden
	public double calculateEMI(double principal) {
		int additionalTax = 200;
		double simpleInterest = (principal * 7.5 * 20) /100;
		double emi = (simpleInterest + principal) / 20;
		return emi+additionalTax;
	}

}

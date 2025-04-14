package inheritanceUsingSuperKeywordToCallMethod;

public class HomeLoan extends Loan{
	public double calculateEMI(double principle) {
		int additionalTax = 200;
		double emi =super.calculateEMI(principle); //calling super class method
		return emi+additionalTax;
	}

}

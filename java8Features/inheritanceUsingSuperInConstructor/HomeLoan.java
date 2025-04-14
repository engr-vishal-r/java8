package inheritanceUsingSuperInConstructor;

public class HomeLoan extends Loan {
	
	HomeLoan(){
		super(5,8.5f); //invoking super class constructor
	}
	public double calculateEMI(double principle) {
		double simpleInterest = (principle * interestRate + tenure)/100;
		double emi = (simpleInterest + principle) /tenure;
		int additionalTax = 200;
		return emi + additionalTax;
	}

}

package inheritanceUsingSuperKeywordToCallMethod;

public class Loan {
	
	public double calculateEMI(double principle) {
		double simpleInterest = (principle*8.5*5)/100;
		double emi = (simpleInterest+principle);
		return emi;
	}

}

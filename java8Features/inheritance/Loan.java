package inheritance;

public class Loan {

	int tenure;
	double principle;
	float interestRate;
	String accountNumber;
	public double calculateEMI() {
		double simpleInterest = (principle*interestRate*tenure)/100;
		return (simpleInterest+principle)/tenure;
	}
}

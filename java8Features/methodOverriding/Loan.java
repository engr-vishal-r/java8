package methodOverriding;

public class Loan {
	public double calculateEMI(double principal) {
		double simpleInterest = (principal * 8.5 *5) /100;
		return (simpleInterest+principal)/5;
				
				
	}

}

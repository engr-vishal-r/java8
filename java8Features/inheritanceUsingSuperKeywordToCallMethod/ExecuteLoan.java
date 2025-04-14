package inheritanceUsingSuperKeywordToCallMethod;

public class ExecuteLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Loan loan = null;
		loan = new HomeLoan(); //runtime polymorphism
		double hloan = loan.calculateEMI(20000);
		System.out.println("Home Loan EMI per year....." + hloan);

	}

}

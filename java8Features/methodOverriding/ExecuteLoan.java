package methodOverriding;

public class ExecuteLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Loan loan = null;
		loan = new HomeLoan(); //runtime polymorphism
		double hloan = loan.calculateEMI(20000);
		loan = new VehicleLoan(); //sup class reference holding sub class object
		double vloan = loan.calculateEMI(20000);
		Loan sloan = new Loan();
		double simpLoan= sloan.calculateEMI(20000);
		
		System.out.println("Personal Loan emi per year is " + simpLoan);
		System.out.println("Home Loan emi per year is   "+ hloan);
		System.out.println("Vehicle Loan emi per year is   "+ vloan);
		
		
	}

}

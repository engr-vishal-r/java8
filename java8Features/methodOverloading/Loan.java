package methodOverloading;

public class Loan {

	private float interest;
	Loan(){
		interest = 8.5f;
	}
	//calculateEMI overload methods 
	public double calulateEMI(int tenure, double principal) {
		double simpleInterest = (principal * interest *tenure) / 100;
		return (simpleInterest + principal)/tenure;
	}
	public double calulateEMI(double principal, int tenure) {
		double simpleInterest = (principal * interest * tenure) / 100;
		return (simpleInterest + principal)/tenure;
}
	public double calulateEMI(int tenure, double principal, float interest) {
		double simpleInterest = (principal * interest * tenure) / 100;
		return (simpleInterest + principal)/tenure;
}
	public static void main(String[] args) {
		Loan loan = new Loan() ;
		double value = loan.calulateEMI(5, 20000d);
			double result = loan.calulateEMI(20000d, 5); //d means double
			double val = loan.calulateEMI(5, 200000d, 9.5f);

		System.out.println(result);
		System.out.println(value);
		System.out.println(val);
		}
	}




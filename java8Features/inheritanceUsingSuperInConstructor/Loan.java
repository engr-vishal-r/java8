package inheritanceUsingSuperInConstructor;

public class Loan {
	protected int tenure;
	protected float interestRate;
	
	Loan(int tenure, float interestRate)
	{
		this.tenure=tenure;
		this.interestRate=interestRate;
	}
}

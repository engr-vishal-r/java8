package superKeyword;

class HomeLoan extends Loan{
    
	  double calculateEMI(double principal){
	  
	    double emi = super.calculateEMI(principal); //To invoke parent class method super keyword is used
	    int additionaltax = 300;
	    emi= emi + additionaltax;
	    return emi;
	  }
	}

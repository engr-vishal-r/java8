package superKeyword;

class Loan {
	  double calculateEMI(double principal) {
	     double simpleInterest = (principal*8.5*5) / 100;
	     double emi = (simpleInterest+principal)/5;
	     return emi;
	  }
	}

	                
	              


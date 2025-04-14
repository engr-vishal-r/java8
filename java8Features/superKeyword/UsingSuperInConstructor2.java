package superKeyword;

class UsingSuperInConstructor2 extends UsingSuperInConstructor1{
	UsingSuperInConstructor2(){
        super(5,8.5f);  //invoking super class constructor
    }
    public double calculateEMI(double principal){
        double simpleInterest = (principal * interestRate * tenure) / 100;
        double emi = (simpleInterest + principal) / tenure;
        int additionalTax = 200;
        return emi + additionalTax;
    }
}



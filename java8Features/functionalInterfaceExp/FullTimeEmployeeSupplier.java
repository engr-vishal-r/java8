package functionalInterfaceExp;

import java.util.List;
import java.util.function.Supplier;

class FullTimeEmployeeSupplier extends EmployeeSupplier
{
	public double generateSalarySlip() {
		System.out.println("SalarySlip of FullTime Employee");
		return super.getSal()*1.20;			//20% increment
	}
	
	public FullTimeEmployeeSupplier(int empId, String empname, double sal, int exp, String gender) {
		super(empId, empname, sal,exp,gender);
		// TODO Auto-generated constructor stub
	}
}



 


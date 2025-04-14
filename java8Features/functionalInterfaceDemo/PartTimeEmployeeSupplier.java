package functionalInterfaceDemo;

import java.util.List;
import java.util.function.Supplier;

class PartTimeEmployeeSupplier extends EmployeeSupplier
{
	public double generateSalarySlip() {
		System.out.println("SalarySlip of PartTime Employee");
		return super.getSal()*1.10;		//10% increment
	}
	
	public PartTimeEmployeeSupplier(int empId, String empname, double sal, int exp, String gender) {
		super(empId, empname, sal,exp,gender);
		// TODO Auto-generated constructor stub
	}
}


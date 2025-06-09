package functionalInterfaceExp;

import java.util.List;
import java.util.function.Supplier;

class EmployeeSuplier {
	public static void main(String[] args) {
		
        List<? extends EmployeeSupplier> lstEmp = EmployeeSupplier.getEmployees();
        for (EmployeeSupplier e : lstEmp) {
            generate(() -> e);
        }
    }

    public static void generate(Supplier<? extends EmployeeSupplier> supplier) {
        System.out.println(supplier.get().generateSalarySlip());
    }
} 

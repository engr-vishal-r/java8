package functionalInterfaceExp;

import java.util.List;
import java.util.function.Function;


public class FunctionMethodDemo {
	

	public static void main(String pars[]) {
        List<Employee> lstEmp = Employee.getEmpList();
        for (Employee e : lstEmp)  {
            double salary = computeSalary(e, e1 -> e1.getSalary() * 1.10);    // 10% salary increment
            System.out.println(e.getName() + ": old salary: " + e.getSalary() + ", new salary: " + salary);
        }
    }
 
    public static double computeSalary(Employee e, Function<Employee, Double> fn) {
        return fn.apply(e);
    }


    
}



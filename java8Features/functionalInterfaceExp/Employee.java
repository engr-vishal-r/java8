package functionalInterfaceExp;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private double salary;
	
	

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public double getSalary() {
		return salary;
	}

	public static List<Employee> getEmpList() {
		// TODO Auto-generated method stub
		List <Employee> empList = new ArrayList <>();
		empList.add(new Employee("John", 500000));
		empList.add(new Employee("Vishal", 80000));
		empList.add(new Employee("James", 750000));
		return empList;
	}
	
}

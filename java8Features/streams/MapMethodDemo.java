package streams;

import java.util.List;
import java.util.stream.Collectors;

public class MapMethodDemo {

	 public static void main(String[] args) {
	        List<EmployeeStream> lstEmp = EmployeeStream.getEmpList();
	        System.out.println("Current Salary : ");
	        lstEmp.forEach((employee) -> System.out.println(employee.getEmpId() + ":" + employee.getEmpName() + ":" + employee.getSal()));
	        System.out.println("*************************************************");
	        List<EmployeeStream> lstNewEmp = lstEmp.stream().filter(employee-> employee.getYearsInOrg() < 1)
	        		//after filtering, the new salary is applied to each employee using the map() method which returns the updated employee stream.
	            .map(employee -> { employee.setSal(employee.getSal() + 5000); return employee; }) 
	          //The collect() method converts a stream to another form.java.util.stream.Collectors which provides implementations of the Collector interface through many useful static methods like toList(), toMap(), groupingBy(), maxBy(), minBy() etc.
	            .collect(Collectors.toList()); 
	        System.out.println("New Salary : ");
	        lstNewEmp.forEach((employee) -> System.out.println(employee.getEmpId() + ":" + employee.getEmpName() + ":" + employee.getSal())); 
	    }
	}

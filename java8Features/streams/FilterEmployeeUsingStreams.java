package streams;

import java.util.List;

public class FilterEmployeeUsingStreams {

	 public static void main(String[] args) {
	        List<EmployeeStream> lstEmp = EmployeeStream.getEmpList();
	 
	        lstEmp.stream().filter(emp -> emp.getYearsInOrg() < 1)
	        .sorted((e1, e2) -> e1.getEmpId().compareTo(e2.getEmpId()))
	        .forEach((e) -> System.out.println(e.getEmpId() + ":" + e.getEmpName()));
	    }
	}
package streams;

import java.util.*;

import streams.EmployeeStream;

public class FilterEmployee {
	public static void main(String[] args) {

		List<EmployeeStream> lstEmp = EmployeeStream.getEmpList();
		List<EmployeeStream> lstNewEmp = new ArrayList<>();
		

		lstEmp.forEach((e) -> {
			if (e.getYearsInOrg() < 1) // Filtering
				lstNewEmp.add(e);
		});
		lstNewEmp.sort((employee1, employee2) -> employee1.getEmpId() - employee2.getEmpId()); // Sorting
		lstNewEmp.forEach((e) -> System.out.println(e.getEmpId() + ":" + e.getEmpName())); // Displaying
	}
}

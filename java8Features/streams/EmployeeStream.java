package streams;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStream {

	private Integer empId;
	private String empName;
	private String country;
	private Float yearsInOrg;
	private Integer sal;

	public Integer getSal() {
		return sal;
	}

	public void setSal(Integer sal) {
		this.sal = sal;
	}

	public EmployeeStream(Integer empId, String empName, String country, Float yearsInOrg, Integer sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.country = country;
		this.yearsInOrg = yearsInOrg;
		this.sal = sal;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	public Float getYearsInOrg() {
		return yearsInOrg;
	}

	public void setYearsInOrg(Float yearsInOrg) {
		this.yearsInOrg = yearsInOrg;
	}
	
	public static List<EmployeeStream> getEmpList(){
		List<EmployeeStream>  empList = new ArrayList<>();
		empList.add( new EmployeeStream(101,"Aron","France", 4.0f, 50000));
		empList.add( new EmployeeStream(102,"Cindia","Uzbekistan", 0.5f, 65000));
		empList.add( new EmployeeStream(103,"Zidane","Singapore", 0.2f, 89000));
		empList.add( new EmployeeStream(104,"Emilia","Mongolia", 1.0f, 100000));
        return empList;
	}
}

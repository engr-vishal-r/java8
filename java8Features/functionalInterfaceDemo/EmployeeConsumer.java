package functionalInterfaceDemo;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;

class EmployeeConsumer
{
	private Integer id;
    private String name;
    private String role;
    private Double sal;
	
	public EmployeeConsumer(Integer id, String name, String role, Double sal) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.sal = sal;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name = name;
	}
	public static List<EmployeeConsumer> getEmpList() {
		EmployeeConsumer e1 = new EmployeeConsumer(101,"Aron","Sr System Engineer",25000D);
		EmployeeConsumer e2 = new EmployeeConsumer(102,"Cindia","System Engineer",20000D);
		EmployeeConsumer e3 = new EmployeeConsumer(103,"Zidane","Technology Lead",35000D);
		EmployeeConsumer e4 = new EmployeeConsumer(104,"Emilia","Technology Architect",40000D);
    	List<EmployeeConsumer> empList = new ArrayList<>(); 
    	empList.add(e1);
    	empList.add(e2);
    	empList.add(e3);
    	empList.add(e4);
    	return empList;
	}
}




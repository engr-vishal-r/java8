package streams;

import java.util.ArrayList;
import java.util.List;

class EmployeeStreamDemo
	{
	    private Integer id;
	    private String name;
	    private Integer yearsInOrg;
	    public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Integer getYearsInOrg() {
			return yearsInOrg;
		}
		public void setYearsInOrg(Integer yearsInOrg) {
			this.yearsInOrg = yearsInOrg;
		}
		public EmployeeStreamDemo(Integer id, String name, Integer yearsInOrg) {
			super();
			this.id = id;
			this.name=name;
			this.yearsInOrg = yearsInOrg;
		}
	    @Override
		public String toString() {
			return "EmployeeStreamDemo [id=" + id + ", yearsInOrg=" + yearsInOrg + ", name=" + name + "]";
		}
		public static List<EmployeeStreamDemo> getEmployeeStreamDemoList()
		{
		    EmployeeStreamDemo e1 = new EmployeeStreamDemo(101,"Roger",0);
	    	EmployeeStreamDemo e2 = new EmployeeStreamDemo(104,"Chris",2);
	    	EmployeeStreamDemo e3 = new EmployeeStreamDemo(103,"Samuel",0);
	    	EmployeeStreamDemo e4 = new EmployeeStreamDemo(102,"Brian",3);
	    	List<EmployeeStreamDemo> empList = new ArrayList<>(); 
	    	empList.add(e1);
	    	empList.add(e2);
	    	empList.add(e3);
	    	empList.add(e4);
	    	return empList;
		}
	}

	
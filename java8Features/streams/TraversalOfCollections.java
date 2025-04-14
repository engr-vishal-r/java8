package streams;

import java.util.ArrayList;
import java.util.List;

public class TraversalOfCollections {
	
		private Integer empId;
	    private String empName;
	    private String country;
		
		public TraversalOfCollections(Integer empId, String empName, String country) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.country = country;
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
	}



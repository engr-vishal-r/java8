package streams;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceTraversal {

	    public static void main (String[] args) {
	    	TraversalOfCollections e1 = new TraversalOfCollections(101,"Aron","France");
	    	TraversalOfCollections e2 = new TraversalOfCollections(102,"Cindia","Uzbekistan");
	    	TraversalOfCollections e3 = new TraversalOfCollections(103,"Zidane","Singapore");
	    	TraversalOfCollections e4 = new TraversalOfCollections(104,"Emilia","Mongolia");
	    	List<TraversalOfCollections> empList = new ArrayList<>(); 
	    	empList.add(e1);
	    	empList.add(e2);
	    	empList.add(e3);
	    	empList.add(e4);
	    	
	    	/*for (Employee emp : empList) {  //Traditional for-each loop
	            System.out.println(emp.getCountry());
	        }*/
	            
	        empList.forEach(emp -> System.out.println(emp.getCountry()));
	        
	    }
	}

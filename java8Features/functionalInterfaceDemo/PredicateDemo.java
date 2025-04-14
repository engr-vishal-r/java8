package functionalInterfaceDemo;

import java.util.*;
import java.util.function.Predicate;

public class PredicateDemo {	

	/**
	 * Predicate is a provide boolean - valued function that takes a single argument
	 * @param args
	 */
	    //main method
	    public static void main(String[] args) {
	    	List<Integer> lstEmpIds = new ArrayList<Integer> ();
			lstEmpIds.add(10006);
			lstEmpIds.add(2000);
			lstEmpIds.add(30001);
			lstEmpIds.add(10005);
			lstEmpIds.add(100010);
	        // lstEmpIds is the populated list of employee ids
	        System.out.println("Printing Even Employee Ids");		
			evaluate(lstEmpIds, (n) -> n % 2 == 0);
	        System.out.println("Printing Odd Employee Ids");
	        evaluate(lstEmpIds, (n) -> n % 2 == 1);
	        System.out.println("Printing Employee Ids less than 1500");
	        evaluate(lstEmpIds, (n) -> n < 1500);
	    }
	    public static void evaluate(List<Integer> listEmpId, Predicate<Integer> predicateArg) {
	        for(int empId : listEmpId) {
	            if(predicateArg.test(empId))
	                System.out.println(empId);
	        }
	    }
	}

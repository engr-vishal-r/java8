package variableArguments;

 class Execute {

		  public static void main(String[] args){
		    Employee employee1=new Employee("E1001");
		    int rewardPoint=employee1.reward(100000,200000,300000);
		    Employee employee2=new Employee("E1002");
		    int rewardPoint1=employee2.reward(100000,100000);
		    System.out.println(employee1.getEmployeeId() +" has got a reward of "+rewardPoint);
		    System.out.println(employee2.getEmployeeId() +" has got a reward of "+rewardPoint1);
		  }
		}

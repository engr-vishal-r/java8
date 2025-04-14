package inheritance;

public class Customer extends Employee {
	
	int salary;
	Customer(int salary){
		this.salary=salary;
		name ="Maddy";
	}
	public void displayDetails() {
		System.out.println(name+age+salary);
	}
}

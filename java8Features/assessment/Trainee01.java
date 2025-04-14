package assessment;

public class Trainee01 extends Employee01 {
	public static void display() { //static methods won't be overridden by subclasses
		System.out.println(" Trainee ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee01 emp = new Trainee01();
		emp.display();

	}

}

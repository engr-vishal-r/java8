package assessment;

public class Trainee06 extends Employee06 {
	public void display(String name) {
		System.out.println(name);
	}
	public int print (int age ) {
		System.out.println("Trainee ");
		return age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainee06 trainee = new Trainee06();
		trainee.display();
		trainee.display("bob ");
		trainee.print(10);
		
	}

}

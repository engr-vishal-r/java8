package java8Cert;

public class Test36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double d = new Double(1/0.);
		boolean x = d.isNaN();
		System.out.println(x);

	}

}

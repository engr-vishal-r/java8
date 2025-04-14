package java8Cert;

public class MyThreadDemo10 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThreadDemo10 t = new MyThreadDemo10();
		t.start();
		System.out.println("one");
		System.out.println("two");

	}
	public void run() {
		System.out.println("Thread");
	}
}

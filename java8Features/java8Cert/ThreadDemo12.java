package java8Cert;

import java.util.concurrent.*;

public class ThreadDemo12 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(2);
		Callable job=() -> {
			Thread.sleep(5000);
			return "Hello";
		};
		es.submit(job);
		es.submit(job);
		Future handle = es.submit(job);
		System.out.println("Submitted");
		String message = (String)handle.get();
		System.out.println(">" + message);
	}

}

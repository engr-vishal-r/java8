package java8Cert;

public class ThreadDemo11 extends Thread{

	synchronized public void run()
	{
		System.out.println("JAVA");
try {
	Thread.sleep(1000);
}
catch(InterruptedException ie){}
System.out.println("Certification");
	}
}


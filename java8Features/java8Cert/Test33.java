package java8Cert;

import java.io.IOException;

public class Test33 {
	
	public static void main(String[] args) throws Exception {
		try {
			throw new IOException();
		}catch (IOException | Exception e) {
			System.out.println( e + "caught");
		}
		
	}

}

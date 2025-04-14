package java8Cert;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fos = new FileOutputStream("D:/output.txt");
		String data = "Leanring ";
		fos.write(data.getBytes());
		fos.close();
		fos= new FileOutputStream("D:/output.txt");
		data = "java is really fun";
		fos.write(data.getBytes());
		fos.close();
		
	}

}

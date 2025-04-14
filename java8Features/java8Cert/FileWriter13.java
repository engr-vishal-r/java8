package java8Cert;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter13 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File file = new File("/myfile.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter buffer = new BufferedWriter(fw);
		
	}

}

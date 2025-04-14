package java8Cert;

import java.util.ArrayList;
import java.util.List;

public class Test27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList();
		list.add(0, "A");
		list.add(1, "B");
		list.add(1, "C");
		for(Object obj : list) {		
			System.out.print(" " + obj);
		}
	}

}

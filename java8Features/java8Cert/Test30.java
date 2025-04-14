package java8Cert;

import java.util.Iterator;
import java.util.TreeSet;

public class Test30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet set = new TreeSet();
		set.add("a");
		set.add(6);
		set.add("c");
		Iterator ite = (Iterator)set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next()+ " ");
		}
		
	}

}

package java8Cert;

import java.util.LinkedList;
import java.util.List;

public class Test29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Float> list = new LinkedList <Float>();
		list.add(100.1f);
		list.add(138.4f);
		list.add(144.5f);
		list.add(null);
		list.add(156.6f);
		list.add(166.4f);
		list.addFirst(099.1f);
		System.out.println(list);
		

	}

}

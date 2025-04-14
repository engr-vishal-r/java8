package java8Cert;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> list1 = new ArrayList<>();
		list1.add("1");
		list1.add("2");
		list1.add(1, "3");
		List <String> list2 = new LinkedList<>(list1);
		list1.addAll(list2);
		list2 = list1.subList(2, 6);
		list2.clear();
		System.out.print(list1 + " ");
	}

}

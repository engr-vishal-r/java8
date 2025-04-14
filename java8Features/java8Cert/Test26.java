package java8Cert;

import java.util.HashMap;
import java.util.Set;

public class Test26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set1 = new HashMap<>(new Comparator<Integer>()){
			@Override
			public int compare(Integer o1,Integer o2) {
				return o2.compareTo(o1);
			}});
			set1.add(234);
			set1.add(657);
			set1.add(143);
			System.out.println(set1);
		}
	}



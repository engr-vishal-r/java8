package java8Cert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamDemo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List employee = Arrays.asList(2,4,6,8,10,12,14);
		List list = employee.stream().map(a->a*a).distinct().collect(Collectors.toList());
		System.out.println(list);
	}

}

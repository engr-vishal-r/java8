package collections;

import java.util.HashMap;
import java.util.Map;

public class MapTester {

	public static void main(String[] args) {
		Map<Integer, String> testMap = new HashMap<>(); //hashmap allows 1 key and 1 null value
		testMap.put(1, "Infosys");
		testMap.put(2, "Google");
		testMap.put(3, "IBM");
		testMap.put(2, "Yahoo"); 
		testMap.put(null, "IBM"); 
		String value = testMap.get(null);
		System.out.println("Value is :" + value);
		
		//using for each method
		
		testMap.forEach((k,v)-> {if(k == null) { System.out.println(k + "value is : " + v);}});
	}
}

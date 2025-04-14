package java8Cert;

import java.util.ArrayList;
import java.util.List;
import org.mockito.Mockito;

public class MockitoToList23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List mockList = (List) Mockito.mock(ArrayList.class);
		mockList.add("MockObject1");
		mockList.add("MockObject2");
		mockList.add("MockObject3");
		mockList.add("MockObject4");
		System.out.println("Initial Size" + mockList.size());
		when(mockList.size()).thenReturn(4);
		System.out.println("Final Size "+ mockList.size());
		
		
	}

}

package java8Cert;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestSpy24 {

	@spy
	static List spylist = new ArrayList();
	@Test
	public void test() {
		doReturn(0).when(spylist).size();
		spylist.add("Testing");
		System.out.println("value at index 0" + spylist.get(0));
		spylist.add("spy");
		doThrow(ArrayIndexOutOfBoundsException.class).when(spylist).isEmpty();
	}
}

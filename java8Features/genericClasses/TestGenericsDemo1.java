package genericClasses;

public class TestGenericsDemo1 {


		public static void main(String args[]) {
			MyGenDemo1<Integer> m = new MyGenDemo1<Integer>();
	           m.add(2);  // line 7
	           m.add("5"); //line 8 gives error because add(T) accepts only integer
	           System.out.println(m.get());
		}
	}

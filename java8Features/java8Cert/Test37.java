package java8Cert;

public class Test37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b =15;
		if(++a<(b=b-=4)||(a=a+=4)>b++) {
			System.out.println(a + "," + b);
		}

	}

}

package java8Cert;

public class Test39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int twoD[][]= new int[4][];
		twoD[0] = new int[1];
		twoD[1] = new int[2];
		twoD[2] = new int[3];
		twoD[3] = new int[4];
		for (int i=0; i<4; i++) {
			for(int j=0; j< i+1; j++) {
				twoD[i][j];
			}
			System.out.println("excuted");
		}

	}

}

package java8Cert;

public class TestDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringFormater04 sf1 = (s1,s2)->{return(s1+s2);};
		evaInput("Lambda","Expression",sf1);
		StringFormater04 sf2 = (s1,s2)->{return(s1.toUpperCase())+" "+(s2.toUpperCase());};
		evaInput("java","se8 features",sf2);
	}
	public static void evaInput(String s1, String s2,StringFormater04 sf ){
		System.out.println(sf.format(s1, s2));
	}
}

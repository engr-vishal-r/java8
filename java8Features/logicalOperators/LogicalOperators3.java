package logicalOperators;

public class LogicalOperators3 {

	/**
	 * The variable b4 is calculated using the following logic:
	It performs an AND operation (&&) between b1, b2, and the NOT of b3
	For b4 to be true, all parts of the AND operation must be true
	 * 
	 */
	public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = false;
        
        boolean b4 = b1 && b2 && (!b3);
        System.out.println("b4 = " + b4);

    }
}
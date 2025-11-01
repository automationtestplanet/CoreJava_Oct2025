package oops.abstraction;

public interface Interface2 {

	int A = 100; // public static final

	/**
	 * Description: It performs addition operation on two integer variables and
	 * returns the sum
	 * 
	 * @author Raj
	 * @param a
	 * @param b
	 * @return Integer value
	 */
	int addition(int a, int b);

	/**
	 * Description: It performs subtraction operation on two integer variables and
	 * returns the value
	 * 
	 * @author Raj
	 * @param a
	 * @param b
	 * @return Integer value
	 */
	int subtraction(int a, int b);

	static int multiplication(int a, int b) {
		return a*b;
	}
	
	default int division(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		System.out.println(Interface2.multiplication(10,20));
		
		
//		System.out.println(Interface2.division(10,20)); // error, cannot access default method
	}
}

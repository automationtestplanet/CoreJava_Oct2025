package oops.abstraction;

public interface InterfaceWithAnonymousClass {

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

	public static void main(String[] args) {
		InterfaceWithAnonymousClass inf1 = new InterfaceWithAnonymousClass() {
			@Override
			public int addition(int a, int b) {
				return a + b;
			}

			@Override
			public int subtraction(int a, int b) {
				return a - b;
			}
		};
		
		System.out.println(inf1.addition(10, 20));
		System.out.println(inf1.subtraction(10, 20));
	}
}

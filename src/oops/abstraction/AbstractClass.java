package oops.abstraction;

public abstract class AbstractClass {

	int a;
	int b;

	public AbstractClass(int a, int b) {
		this.a = a;
		this.b = b;
	}

	/**
	 * Description: It performs addition operation on two integer variables and
	 * returns the sum
	 * 
	 * @author Raj
	 * @param a
	 * @param b
	 * @return
	 */
	abstract int addition(int a, int b);

	int subtraction(int a, int b) {
		return a - b;
	}
	
	public static void main(String[] args) {
//		AbstractClass absCls = new AbstractClass(10,20);
	}
}

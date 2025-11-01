package oops.abstraction;

abstract public class PartialAbstraction {

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
//		PartialAbstraction parAbs = new PartialAbstraction(); // can not create the object of ABstract Class
	}
}

package oops.abstraction;

public abstract class AbstractClassWithAnonymousClass {

	int a;
	int b;

	public AbstractClassWithAnonymousClass(int a, int b) {
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
		
		AbstractClassWithAnonymousClass absCls = new AbstractClassWithAnonymousClass(10,20) {
			@Override
			int addition(int a, int b) {				
				return a+b;
			}			
		};
		
		System.out.println(absCls.addition(10,20));
		System.out.println(absCls.subtraction(10,20));
	}
}

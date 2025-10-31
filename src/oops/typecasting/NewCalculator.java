package oops.typecasting;

public class NewCalculator extends Calculator {
	
	public int modDivision(int a, int b) {
		return a % b;
	}
	
	@Override
	public int addition(int a, int b) {
		return a + b + 5;
	}
	
	// @Override //static method we can not override
	static int division(int a, int b) {   
		return a / b + 11;
	}
	
//	@Override
//	final protected int subtraction(int a, int b) {   // final method we can not override
//		return a - b;
//	}
	
	
}

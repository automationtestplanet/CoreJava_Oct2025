package oops.abstraction;

public class ImplementInterfaces implements Interface3, Interface4, Interface5 {

	@Override
	public int modDivision(int a, int b) {
		return a % b;
	}

	@Override
	public int multiplication(int a, int b) {
		return a * b;
	}

	@Override
	public int division(int a, int b) {
		return a / b;
	}

	@Override
	public int addition(int a, int b) {
		return a + b;
	}

	@Override
	public int subtraction(int a, int b) {
		return a - b;
	}

}

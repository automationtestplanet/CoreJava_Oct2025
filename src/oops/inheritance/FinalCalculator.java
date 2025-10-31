package oops.inheritance;

public final class FinalCalculator {
	
	final int a = 100;

	public int addition(final int a, int b) {
		return a + b;
	}

	protected int subtraction(int a, int b) {
		return a - b;
	}

	public final int multiplication(int a, int b) {
		return a * b;
	}

	int division(int a, int b) {
		return a / b;
	}
}

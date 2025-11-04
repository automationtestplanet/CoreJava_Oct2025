package exceptions;

public class UnCheckedExceptions {

	public static void division(int a, int b) {
		try {
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException ae) {
			System.out.println("Divide by zero is not possbile with any number");
		}
	}

	public static void main(String[] args) {
		System.out.println("Program Execution Started");
		division(1000, 0);
		System.out.println("Program Execution Ended");
	}

}

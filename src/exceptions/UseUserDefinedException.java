package exceptions;

public class UseUserDefinedException {

	public static void division(int a, int b) {
		if (b > 0) {
			System.out.println(a / b);
		} else {
			throw new UserDefinedException("Divide by zero is not possible");
		}
	}

	public static void main(String[] args) {
		try {
			division(100, 0);
		} catch (UserDefinedException ue) {
			System.out.println(ue.getMessage());
		}
	}
}

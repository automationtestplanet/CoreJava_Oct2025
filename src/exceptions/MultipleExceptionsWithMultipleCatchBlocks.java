package exceptions;

public class MultipleExceptionsWithMultipleCatchBlocks {

	public static void main(String[] args) {

		System.out.println("Program Execution Started");

		int a = 1000;
		int b = 10;

		String str = "Hello";

		int[] intArr = { 10, 20 };

		try {
			int c = a / b;
			System.out.println(c);

			System.out.println(str.toUpperCase());

			System.out.println(intArr[2]);

		} catch (ArithmeticException ae) {
			System.out.println("Divide by zero is not possbile with any number");
		} catch (NullPointerException ae) {
			System.out.println("Can not perfrom any operation on null");
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("We can access only availbel index values");
		}

		System.out.println("Program Execution Ended");

	}

}

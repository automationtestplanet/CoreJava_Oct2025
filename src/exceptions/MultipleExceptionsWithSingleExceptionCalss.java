package exceptions;

public class MultipleExceptionsWithSingleExceptionCalss {

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
			
//			Exception ae= new ArithmeticException();
//			Exception ne= new NullPointerException();
//			Exception aie= new ArrayIndexOutOfBoundsException();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			
			
		}

		System.out.println("Program Execution Ended");

	}

}

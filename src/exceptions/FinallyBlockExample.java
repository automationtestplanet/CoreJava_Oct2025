package exceptions;

public class FinallyBlockExample {

	public static void main(String[] args) {

		int a = 1000;
		int b = 0;

		try {
			System.out.println("Program Execution Started");
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Program Execution Ended");
		}

	}

}

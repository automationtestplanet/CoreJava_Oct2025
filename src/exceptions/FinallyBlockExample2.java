package exceptions;

public class FinallyBlockExample2 {

	public static void main(String[] args) {
		try {
			System.out.println("DB Connection Opened");
			int a = 1000;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("DB Connection Closed");
		}
	}
}

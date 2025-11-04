package exceptions;

public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println("Program Execution Started");
		
		int a = 1000;
		int b = 0;
			
		try {		
			int c = a/b;
//			ArithmeticException ae = new ArithmeticException();
			System.out.println(c);
		}catch(ArithmeticException ae) {
//			System.out.println(ae.getMessage());
//			ae.printStackTrace();
//			int c = a/1;
//			System.out.println(c);
			
			System.out.println("Divide by zero is not possbile with any number");
			
		}
		
		System.out.println("Program Execution Ended");

	}

}

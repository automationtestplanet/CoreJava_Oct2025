package exceptions;

public class BankTransactionException extends RuntimeException {

	public BankTransactionException(String message) {
		System.out.println(message);
	}
}

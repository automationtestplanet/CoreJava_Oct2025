package exceptions;

public class UserDefinedException extends RuntimeException {
	public UserDefinedException(String messgae){
		System.out.println(messgae);
	}
}

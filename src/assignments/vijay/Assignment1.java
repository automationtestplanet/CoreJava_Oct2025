package assignments.vijay;

public class Assignment1 {

	// Write a program to check the given number is Buzz Number
	// Ex: 25 -> Buzz number
	// Ex: 13 -> not Buzz Number

	public static int number = 7;
	
	int num = 29;
	
	
	public static void BuzzNumbers() {
		if (number % 10 == 7 || number % 7 == 0) {
			System.out.println(number + ": is a Buzz Number");
		} else {
			System.out.println(number + ": is not a Buzz Number");
		}
	}
	
	public void BuzzNumber() {
		if (num % 10 == 7 || num % 7 == 0) {
			System.out.println(num + ": is a Buzz Number");
		} else {
			System.out.println(num + ": is not a Buzz Number");
		}
	}
	
	public static void BuzzNumber(int num) {
		if (num % 10 == 7 || num % 7 == 0) {
			System.out.println(num + ": is a Buzz Number");
		} else {
			System.out.println(num + ": is not a Buzz Number");
		}
	}
	
	

	public static void main(String[] args) {
		
		BuzzNumbers();
		
		Assignment1 number = new Assignment1();
		number.BuzzNumber();
		
		BuzzNumber(63);
		

		
		

	}

}

package assignments.raju;

public class Assignment1 {

	// Write a reusable code to print the factorial value of a number
	// num: 5 -> 5X4X3X2X1 -> 120
	public static void printFactorialValueOfGivenNumber(int num) {
		int sum = 1;
		for (int i = 1; i <= num; i++) {
			sum = sum * i;
		}
		System.out.println(num + " Factorail Value: " + sum);
	}

	public static void main(String[] args) {
		printFactorialValueOfGivenNumber(25);
		printFactorialValueOfGivenNumber(30);
		printFactorialValueOfGivenNumber(40);
	}
}

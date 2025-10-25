package demo;

public class InterviewQuestions {

	// swap numbers using third variable
	public static void swapNumbersUsing3rdVariable(int a, int b) {
		System.out.println("Before swaping the varibles");
		System.out.println("A= " + a);
		System.out.println("B= " + b);

		int c = a; // 10
		a = b; // 20
		b = c; // 10

		System.out.println("After swaping the varibles");
		System.out.println("A= " + a);
		System.out.println("B= " + b);
	}

	// swap numbers using third variable
	public static void swapNumbersWithoutUsing3rdVariable(int a, int b) {
		System.out.println("Before swaping the varibles");
		System.out.println("A= " + a);
		System.out.println("B= " + b);

		a = a + b; // a=30
		b = a - b; // b=10
		a = a - b; // a=20

		System.out.println("After swaping the varibles");
		System.out.println("A= " + a);
		System.out.println("B= " + b);
	}

	// swap numbers using third variable
	public static void swapStringsUsing3rdVariable(String a, String b) {
		System.out.println("Before swaping the varibles");
		System.out.println("A= " + a);
		System.out.println("B= " + b);

		String c = a;
		a = b;
		b = c;

		System.out.println("After swaping the varibles");
		System.out.println("A= " + a);
		System.out.println("B= " + b);
	}

	// swap numbers using third variable
	public static void swapStringsWithoutUsing3rdVariable(String a, String b) {
		System.out.println("Before swaping the varibles");
		System.out.println("A= " + a);
		System.out.println("B= " + b);

		a = a + b; // HelloJava
		b = a.replace(b, ""); // Hello
		a = a.replace(b, ""); // Java

		System.out.println("After swaping the varibles");
		System.out.println("A= " + a);
		System.out.println("B= " + b);
	}

	// Check the number Even or Odd
	public static void checkEvenOrOddNumber(int a) {
		if (a % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

	// Check prime number
	public static void checkPrimeOrNot(int num) {
		int count = 0;

		for (int i = 2; i <= num; i++) { // 2 -> 10 , 10%2 == 0 1, 10%3 !=0 1, 10%4 1, 10%5 2, .. 10%10 3.
			if (num % i == 0) {
				count++;
			}
		}

		if (count == 1)
			System.out.println(num + " is prime number");
		else
			System.out.println(num + " is not a prime number");
	}

	// Check Reverse number
	public static void checkRevereNum(int num) {
		int revNum = 0;

		while (num > 0) {
			int remainder = num % 10; // 3, 2, 1
			revNum = (revNum * 10) + remainder; // 0+3, 30+2, 320+1 = 321
			num = num / 10; // 12 , 1, 0
		}

		System.out.println(revNum);
	}

	// Check number Armstrong number
	public static void checkArmstrongNum(int num) {
		int sum = 0;
		int tempNum = num;

		while (tempNum > 0) {
			int remainder = tempNum % 10; // 3,5,1
			sum = sum + (remainder * remainder * remainder); // 27+125+1=153
			tempNum = tempNum / 10; // 15 , 1, 0
		}

		if (num == sum)
			System.out.println(num + " is a Armstrong Number");
		else
			System.out.println(num + " is not a Armstrong Number");

	}

	// Check number Palindrome
	public static void checkNumberPalindrome(int num) {
		int revNum = 0;
		int tempNum = num;

		while (tempNum > 0) {
			int remainder = tempNum % 10; // 3, 2, 1
			revNum = (revNum * 10) + remainder; // 0+3, 30+2, 320+1 = 321
			tempNum = tempNum / 10; // 12 , 1, 0
		}

		if (num == revNum)
			System.out.println(num + " is a Palindrome Number");
		else
			System.out.println(num + " is not a Palindrome Number");

	}

	// Check Reverse String
	public static void revereString(String str) {
		String revStr = "";

		for (int i = 0; i < str.length(); i++) {
			revStr = str.charAt(i) + revStr; // Hello -> eH, leH, lleH, olleH
		}
		System.out.println(revStr);
	}

	// Check Reverse String
	public static void revereString2(String str) {
		String revStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i); // Hello -> o, ol, oll, olle, olleH
		}
		System.out.println(revStr);
	}

	// Check Reverse String
	public static void revereString3(String str) {
		String revStr = "";
//		char[] charArr = str.toCharArray();
		for (char eachChar : str.toCharArray()) {
			revStr = eachChar + revStr; // Hello -> H, eH, leH, lleH, olleH
		}

		System.out.println(revStr);
	}

	// Check String Palindome
	public static void checkStringPalindrome(String str) {
		String revStr = "";
//			char[] charArr = str.toCharArray();
		for (char eachChar : str.toCharArray()) {
			revStr = eachChar + revStr; // Hello -> H, eH, leH, lleH, olleH
		}
		if (str.equals(revStr))
			System.out.println(str + " is a Palindrome");
		else
			System.out.println(str + " is not a Palindrome");
	}

	public static void main(String[] args) {
//		swapNumbersUsing3rdVariable(10,20);
//		swapNumbersWithoutUsing3rdVariable(10, 20);
//		swapStringsUsing3rdVariable("Hello", "Java");
//		swapStringsWithoutUsing3rdVariable("Hello", "Java");
//		checkEvenOrOddNumber(1161536719);		
//		checkPrimeOrNot(11);    // 2, 3, 5, 7, 11,13, 17, 19   // 11  -> 2,3,4,5,6,7,8,9,10,11  ->		
//		checkRevereNum(123782);
//		checkArmstrongNum(162556);  // 1^3+0^3 = 1+0 = 1, 123-> 1^3+2^3+3^3 = 1+8+27 = 36,  
		// 153 -> 1^3 + 5^3 + 3^3 = 1+125+27 = 153
//		checkNumberPalindrome(123); // 123->321, 121->121 - Palindrome, 101
//		revereString3("Hello");		
//		checkStringPalindrome("malayalam");
	}

}

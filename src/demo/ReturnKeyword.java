package demo;

public class ReturnKeyword {

	public static int addition(int a, int b) {
		return a + b;
	}

	public static void division(int a, int b) {
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int c = 3;

//		int result = addition(a, b);
//		division(result,c);
		
		division(addition(a, b),c);
		
		

	}

}

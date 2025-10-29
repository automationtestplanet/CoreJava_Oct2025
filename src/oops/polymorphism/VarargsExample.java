package oops.polymorphism;

public class VarargsExample {

//	public int addition(int a, int b) {
//		return a + b;
//	}
//
//	public int addition(int a, int b, int c) {
//		return a + b + c;
//	}
//
//	public int addition(int a, int b, int c, int d) {
//		return a + b + c + d;
//	}
//
//	public int addition(int a, int b, int c, int d, int e) {
//		return addition(a, b, c, d) + e;
//	}

	public int addition(int... a) {
		int sum = 0;
		for (int eachVal : a) {
			sum += eachVal;
		}
		return sum;
	}

	public static void main(String[] args) {
		VarargsExample varArgsEx = new VarargsExample();
		System.out.println(varArgsEx.addition(10));
		System.out.println(varArgsEx.addition(10, 20));
		System.out.println(varArgsEx.addition(10, 20, 30));
		System.out.println(varArgsEx.addition(10, 20, 30, 40));
		System.out.println(varArgsEx.addition(10, 20, 30, 40, 50));
		System.out.println(varArgsEx.addition(10, 20, 30, 40, 50, 60));
		System.out.println(varArgsEx.addition(10, 20, 30, 40, 50, 60, 70));
		System.out.println(varArgsEx.addition(10, 20, 30, 40, 50, 60, 70, 80));

	}

}

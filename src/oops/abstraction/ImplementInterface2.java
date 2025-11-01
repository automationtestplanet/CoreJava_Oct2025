package oops.abstraction;

public class ImplementInterface2 implements Interface2 {
	@Override
	public int addition(int a, int b) {
		return a + b;
	}

	@Override
	public int subtraction(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		Interface2 inf2 = new ImplementInterface2();
		System.out.println(inf2.addition(10, 20));
		System.out.println(inf2.subtraction(10, 20));
		
		System.out.println(Interface2.multiplication(10, 20));
		System.out.println(inf2.division(10, 20));
	}
}

package oops.abstraction;

public class ExtendsArithematicOperationsWithInterfaces extends ArithematicOperations
		implements Interface4, Interface5 {

	@Override
	public int modDivision(int a, int b) {
		return a % b;
	}

	@Override
	public int multiplication(int a, int b) {
		return a * b;
	}

	@Override
	public int division(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		ArithematicOperations arop = new ExtendsArithematicOperationsWithInterfaces();

		System.out.println(arop.addition(10, 20));
		System.out.println(arop.subtraction(10, 20));
//		System.out.println(arop.multiplication(10, 20));
//		System.out.println(arop.division(10, 20));
//		System.out.println(arop.modDivision(10, 20));

		Interface4 inf4 = (Interface4) arop;

		System.out.println(inf4.addition(10, 20));
		System.out.println(inf4.subtraction(10, 20));
		System.out.println(inf4.multiplication(10, 20));
		System.out.println(inf4.division(10, 20));
//		System.out.println(inf4.modDivision(10, 20));

		Interface5 inf5 = (Interface5) arop;
		System.out.println(inf5.addition(10, 20));
		System.out.println(inf5.subtraction(10, 20));
		System.out.println(inf5.multiplication(10, 20));
		System.out.println(inf5.division(10, 20));
		System.out.println(inf5.modDivision(10, 20));

	}

}

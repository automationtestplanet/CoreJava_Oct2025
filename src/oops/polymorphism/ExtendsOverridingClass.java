package oops.polymorphism;

public class ExtendsOverridingClass extends OverridingExample {

	@Override
	public int addition(int a, int b) {
		System.out.println("From Child Class");
		return super.addition(a , b) + 5;
	}

	public static void main(String[] args) {
		ExtendsOverridingClass extCls = new ExtendsOverridingClass();

		System.out.println(extCls.addition(10, 20));
	}

}

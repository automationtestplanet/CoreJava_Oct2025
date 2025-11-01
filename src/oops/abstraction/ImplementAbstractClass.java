package oops.abstraction;

public class ImplementAbstractClass extends AbstractClass {

	public ImplementAbstractClass(int a, int b) {
		super(a, b);
	}

	@Override
	int addition(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		AbstractClass absCls = new ImplementAbstractClass(10, 20);
		System.out.println(absCls.a);
		System.out.println(absCls.b);
	}

}

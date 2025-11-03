package oops.abstraction;

public class AccessFunctionalInterface {
	

	public static void main(String[] args) {

		FunctionalInterfaceExample funInf = new FunctionalInterfaceExample() {
			@Override
			public int addition(int a, int b) {
				return a + b;
			}
		};

		System.out.println(funInf.addition(10, 20));

		FunctionalInterfaceExample funInf2 = (a, b) -> {
			return a + b;
		}; // lambda expression

		System.out.println(funInf2.addition(100, 200));

		FunctionalInterfaceExample funInf3 = (a, b) -> a + b;
		System.out.println(funInf3.addition(1000, 2000));
	}

}

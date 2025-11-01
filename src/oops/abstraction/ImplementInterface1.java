package oops.abstraction;

public class ImplementInterface1 implements Interface1 {

	@Override
	public int addition(int a, int b) {
		return a+b;
	}

	@Override
	public int subtraction(int a, int b) {
		return a-b;
	}
	
	public static void main(String[] args) {
		System.out.println(Interface1.A);
//		Interface1.A = 200;  // final Can not change
	}

	

}

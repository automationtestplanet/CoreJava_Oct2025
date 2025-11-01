package oops.abstraction;

public class ImplementsFullAbstraction implements FullAbstraction {

	@Override
	public int addition(int a, int b) {
		return a+b;
	}

	@Override
	public int subtraction(int a, int b) {
		return a-b;
	}
	
	public static void main(String[] args) {
		FullAbstraction fullABs = new ImplementsFullAbstraction();
		
		System.out.println(fullABs.addition(10, 20));
		System.out.println(fullABs.subtraction(10, 20));
	}

}

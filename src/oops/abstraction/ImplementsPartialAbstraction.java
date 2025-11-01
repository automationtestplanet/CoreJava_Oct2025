package oops.abstraction;

public class ImplementsPartialAbstraction extends PartialAbstraction {

	@Override
	int addition(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		PartialAbstraction impParAbsCls = new ImplementsPartialAbstraction();
		
		System.out.println(impParAbsCls.addition(10, 20));
	}

}

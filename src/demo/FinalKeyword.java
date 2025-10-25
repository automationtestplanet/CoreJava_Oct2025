package demo;

final public class FinalKeyword {
	
	static final int A = 1000;
	final int B = 10000;
	
	final static void addition(int a, final int b) {
		a = 100;
//		b = 200; // final variable
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		int a = 100;
		final  int b = 200;
		System.out.println(a);
		System.out.println(b);
		
		a= 300;
//		b = 400; // final variable
		
		addition(10,20);
		
		System.out.println(FinalKeyword.A);
//		FinalKeyword.a = 2000;  // final variable
		
		
		FinalKeyword var1 = new FinalKeyword();
		
		System.out.println(var1.B);
//		var1.b = 20000;  // final variable
	}

}

package demo;

public class Fundamentals {

	static int a = 100;
	int b = 200;

	void addition() {
		System.out.println(Fundamentals.a + this.b);
	}

	void substration() {
		System.out.println(Fundamentals.a - this.b);
	}

	static void multiplication() {
//		System.out.println(a*b); // memory is not allocated for B,  we can not access 
	}
	
	void division(int c, int d) {
		System.out.println(c/d);
	}
	
	int modDivision(int a, int b) {
		return a%b;
	}

	public static void main(String[] args) {

		System.out.println(a);

//			addition();
//			
//			substration();

		Fundamentals fun1 = new Fundamentals();

		fun1.addition();

		fun1.substration();
		
		System.out.println("Operation1");
		System.out.println("Operation2");
		System.out.println("Operation3");
		System.out.println("Operation4");
		
		System.out.println(a);
		System.out.println(fun1.b);
		
		
		fun1.division(10, 5);
		
//		System.out.println(c);
//		System.out.println(fun1.d);
		
		byte result = (byte) fun1.modDivision(1000, 300);  //100
		
		System.out.println(Fundamentals.a);
		Fundamentals.multiplication();
		
		System.out.println(fun1.b);
		fun1.division(10, 5);
		
//		this.addition();  // this keyword is not allowed nsatic method.
		
		
		
	}

}

package demo;

public class TypeOfVariables {
	
	static int x = 100;    // static variable
	static int y = 200;
	
	int p = 300;  // non-static/instance variable
	int q = 400;
	
	
	
	public static void addition(int c, int d) {  // here c and d local variables only
		c = 300;
		d =400;
//		System.out.println(a+b);
		System.out.println(c+d);
		System.out.println(x*y);
		
		
		TypeOfVariables typesOfvar = new TypeOfVariables();  // object		
		
		System.out.println(typesOfvar.p+" "+typesOfvar.q);
	}
	
	public static void multiplication() {   // static method
		System.out.println(x*y);
		
		TypeOfVariables typesOfvar = new TypeOfVariables();  // object	
		
		typesOfvar.p = 500; typesOfvar.q = 600;
		
		System.out.println(typesOfvar.p+" "+typesOfvar.q);
	}
	
	public void subtraction() {   // non-static/instance method
		System.out.println(p-q);
	}

	public static void main(String[] args) {
		int a = 100;  // local variables
		int b = 200;  // local variables
		
		System.out.println(a+b);
//		System.out.println(c+d);
		
		multiplication();
		System.out.println(x*y);
		
		
		TypeOfVariables typesOfvar = new TypeOfVariables();  // object
		
		int x = 100;
		
		System.out.println(typesOfvar.p+" "+typesOfvar.q);
		
		typesOfvar.subtraction();
		
		TypeOfVariables typesOfvar2 = new TypeOfVariables();  // object
		
		typesOfvar2.p = 700;
		typesOfvar2.q = 800;
		
		System.out.println(typesOfvar2.p+" "+typesOfvar2.q);
		System.out.println(typesOfvar.p+" "+typesOfvar.q);

	}

}

package demo;

public class DifferentMethods {
	
	void addition(int a, int b) {
		System.out.println(a+b);
	}
	
	void addition(int a, float b) {
		System.out.println(a+b);
	}
	
	void addition(float a, int b) {
		System.out.println(a+b);
	}
	
	void addition(float a, float b) {
		System.out.println(a+b);
	}
	
	void addition(String a, String b) {
		System.out.println(a+b);
	}
	
	void addition(char a, char b) {
		System.out.println(a+b);
	}
	
	void addition(int a, int b,int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		DifferentMethods methods = new DifferentMethods();
		methods.addition(100, 200);

	}

}

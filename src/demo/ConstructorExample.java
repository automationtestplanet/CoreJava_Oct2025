package demo;

public class ConstructorExample {

	static boolean bool1;
	static byte byte1;
	static short short1;
	static int int1;
	static long long1;
	static float float1;
	static double double1;
	static char char1;
	static String str1;

	ConstructorExample() {

	}
	
	public static void display(int b) {
		int a;
//		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		System.out.println(bool1);
		System.out.println(byte1);
		System.out.println(short1);
		System.out.println(int1);
		System.out.println(long1);
		System.out.println(float1);
		System.out.println(double1);
		System.out.println(char1);
		System.out.println(str1);

//		display();
	}

}

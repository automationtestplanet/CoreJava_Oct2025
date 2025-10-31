package oops.polymorphism;

public class OverloadingExample {

	public int addition(int a, int b) {
		return a + b;
	}

	public float addition(int a, float b) {
		return a + b;
	}

	public float addition(float a, int b) {
		return a + b;
	}

	public float addition(float a, float b) {
		return a + b;
	}

	public String addition(String a, String b) {
		return a + b;
	}

	public int addition(char a, char b) {
		return a + b;
	}

	public int addition(int a, int b, int c) {
		return a + b + c;
	}

	public int addition(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public static void main(String[] args) {
		
		OverloadingExample overLoad = new OverloadingExample();
		System.out.println(overLoad.addition(10, 20));
		System.out.println(overLoad.addition(10, 20.0F));
		System.out.println(overLoad.addition(10.0F, 20));
		System.out.println(overLoad.addition(10.0F, 20.0F));
		System.out.println(overLoad.addition('a', 'b'));
		System.out.println(overLoad.addition("Heelo", "Java"));
		System.out.println(overLoad.addition(10, 20, 30));
		System.out.println(overLoad.addition(10, 20, 30, 40));
	}

}

package oops.polymorphism;

public class ExtendOverloadingClass extends OverloadingExample {

	public int addition(int a, int b, int c, int d, int e) {
		return addition(a, b, c, d)+ e;
	}

	public static void main(String[] args) {
		ExtendOverloadingClass extCls = new ExtendOverloadingClass();

		System.out.println(extCls.addition(10, 20));
		System.out.println(extCls.addition(10, 20.0F));
		System.out.println(extCls.addition(10.0F, 20));
		System.out.println(extCls.addition(10.0F, 20.0F));
		System.out.println(extCls.addition('a', 'b'));
		System.out.println(extCls.addition("Heelo", "Java"));
		System.out.println(extCls.addition(10, 20, 30));
		System.out.println(extCls.addition(10, 20, 30, 40));
		System.out.println(extCls.addition(10, 20, 30, 40, 50));
	}
}

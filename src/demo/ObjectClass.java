package demo;

import oops.polymorphism.OverloadingExample;

public class ObjectClass {

//	public int addition(int a, int b) {
//		return a + b;
//	}
//
//	public float addition(int a, float b) {
//		return a + b;
//	}
//
//	public float addition(float a, int b) {
//		return a + b;
//	}
//
//	public float addition(float a, float b) {
//		return a + b;
//	}
//
//	public String addition(String a, String b) {
//		return a + b;
//	}
//
//	public int addition(char a, char b) {
//		return a + b;
//	}
	
	public Object addition(Object a, Object b) {
		return (int)a + (int)b;
		
	}

	public static void main(String[] args) {
		Object obj1 = 100;
		Object obj2 = 1000;
		Object obj3 = 10000;
		Object obj4 = 100000L;
		Object obj5 = 100.5F;
		Object obj6 = 1000.345E34D;
		Object obj7 = 'A';
		Object obj8 = "Hello";
		Object obj9 = true;
		Object obj10 = new ObjectClass();
		
		long long1 = (long)obj4;
		float float1 = (float)obj5;
		double double1 = (double)obj6;
		char char1 = (char)obj7;
		String str1 = (String)obj8;
		boolean bool1 = (boolean)obj9;
		ObjectClass objCls1 = (ObjectClass)obj10;

		ObjectClass overLoad = new ObjectClass();
		System.out.println(overLoad.addition(10, 20));
		System.out.println(overLoad.addition(10, 20.0F));
		System.out.println(overLoad.addition(10.0F, 20));
		System.out.println(overLoad.addition(10.0F, 20.0F));
		System.out.println(overLoad.addition('a', 'b'));
		System.out.println(overLoad.addition("Heelo", "Java"));

	}

}

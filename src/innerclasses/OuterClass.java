package innerclasses;

public class OuterClass {

	static class StaticInnerClass {
		public void method1() {
			System.out.println("This is Static Inner class method1");
		}

		public static void method3() {
			System.out.println("This is Static Inner class staic method3");
		}
	}

	class InstanceInnerClass {
		public void method2() {
			System.out.println("This is Instance Inner class method2");
		}
	}

	static { // static block
		int a = 100;
		int b = 200;
		int result = a + b;
		System.out.println("This is Static Block");
	}

	{ // Anonymous
		int a = 100;
		int b = 200;
		int result = a + b;
		System.out.println("This is Anonymous");
	}

	public static void main(String[] args) {
		System.out.println("This is Outer class main method");

		OuterClass outCls = new OuterClass();

		OuterClass.StaticInnerClass statInCls = new StaticInnerClass();
		statInCls.method1();

		OuterClass.StaticInnerClass.method3();

		OuterClass.InstanceInnerClass instInCls = outCls.new InstanceInnerClass();
		instInCls.method2();

	}
}

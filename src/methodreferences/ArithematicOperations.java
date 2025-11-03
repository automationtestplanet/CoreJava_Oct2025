package methodreferences;

public class ArithematicOperations {

	static void addition(int a, int b) {
		System.out.println(a + b);
	}

	static int subtraction(int a, int b) {
		return a - b;
	}

	void multiplication(int a, int b) {
		System.out.println(a * b);
	}

	int division(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		FunctionInterface1 fun1 = ArithematicOperations::addition;
		fun1.addition(10, 20);

		FunctionInterface2 fun2 = ArithematicOperations::subtraction;
		System.out.println(fun2.subtraction(10, 20));

		ArithematicOperations arOp = new ArithematicOperations();

		FunctionInterface1 fun1_1 = arOp::multiplication;
		fun1_1.addition(10, 20);

		FunctionInterface2 fun2_1 = arOp::division;
		System.out.println(fun2_1.subtraction(10, 3));

	}

}

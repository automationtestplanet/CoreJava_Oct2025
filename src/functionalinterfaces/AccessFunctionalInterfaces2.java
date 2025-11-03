package functionalinterfaces;

public class AccessFunctionalInterfaces2 {

	public static void main(String[] args) {

		FunctionInterface1 fun1 = new FunctionInterface1() {
			@Override
			public void displayValue(int a) {
				System.out.println(a);
			}
		};
		
		fun1.displayValue(100);
		
		FunctionInterface1 fun1_1 = (a)-> System.out.println(a);
		fun1_1.displayValue(100);
		
		FunctionInterface1 fun1_2 = a-> System.out.println(a);
		fun1_2.displayValue(100);
		
		
		FunctionInterface2 fun2 = new FunctionInterface2() {			
			@Override
			public int getValue(int a) {
				return a+10;
			}
		};
		
		System.out.println(fun2.getValue(100));
		
		FunctionInterface2 fun2_1 = a->{return a+10;};
		System.out.println(fun2_1.getValue(100));
		
		FunctionInterface2 fun2_2 = a->a+10;
		System.out.println(fun2_2.getValue(100));
		
		
		FunctionInterface3 fun3 = new FunctionInterface3() {			
			@Override
			public void displaySum(int a, int b) {
				System.out.println(a+b);				
			}
		};
		
		fun3.displaySum(100, 200);
		
		FunctionInterface3 fun3_1 = (a,b)->System.out.println(a+b);
		fun3_1.displaySum(100, 200);
		
		FunctionInterface4 fun4 = new FunctionInterface4() {			
			@Override
			public int getSum(int a, int b) {
				return a+b;
			}
		};
		
		System.out.println(fun4.getSum(1000, 2000));
		
		FunctionInterface4 fun4_1 = (a,b)-> a+b;
		System.out.println(fun4_1.getSum(1000, 2000));

	}

}

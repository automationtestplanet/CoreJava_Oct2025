package innerclasses;

public class AnonymousClassExample {

	int addition(int a, int b) {
		return a + b;
	}
	
	int subtraction(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		AnonymousClassExample anonymousCls = new AnonymousClassExample() {
			@Override
			int addition(int a, int b) {
				return a + b + 5;
			}
		};
		
		System.out.println(anonymousCls.addition(10, 20));
		System.out.println(anonymousCls.subtraction(10, 20));

	}

}

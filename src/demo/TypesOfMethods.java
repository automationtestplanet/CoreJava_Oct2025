package demo;

public class TypesOfMethods {

	public static void addition(){
		int a = 100;
		int b = 200;
		System.out.println("Addition: "+(a+b));
	}
	
	public static int subtraction() {
		int a = 100;
		int b = 200;
		return a-b;
	}
	
	public static void multiplication(int a, int b) {	// Parameters	
		System.out.println("Multiplication: "+(a*b));
	}
	
	public static int division(int a, int b) {
		return a/b;
	}
	
	public static void modDivision(int a, int b) {
		System.out.println("Modular Division: "+(a%b));
	}
	
	public static String firstName() {
		return "Raju";
	}
	
	public static String lastNameName() {
		return "Chelle";
	}
	
	public static void fullName(String fullName) {
		System.out.println(fullName);
	}
	
	public static void main(String[] args) {
		addition();
		
		int result = subtraction();
		System.out.println(result);
		System.out.println(result+500);
		
		multiplication(100,200);  // Arguments
		multiplication(10,20);
		multiplication(1000,2000);
		
		System.out.println(division(100,5)*3);	
		
		modDivision(division(100,5), subtraction());
		
		int result2 = division(1000, 1000);
		System.out.println(result2);
		
		modDivision(division(5, 5), 20);
		
//		String firstName = firstName();
//		String lastName = lastNameName();
//		fullName(firstName+lastName);
		fullName(firstName()+lastNameName());
		
	}

}

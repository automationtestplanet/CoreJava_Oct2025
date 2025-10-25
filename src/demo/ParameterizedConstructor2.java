package demo;

public class ParameterizedConstructor2 {

	boolean bool1;
	int int1;
	float float1;
	static char char1;
	static String str1;

	ParameterizedConstructor2(boolean bool1, int int1, float float1, char char1, String str1) {
		this.bool1 = bool1;
		this.int1 = int1;
		this.float1 = float1;
		ParameterizedConstructor2.char1 = char1;
		ParameterizedConstructor2.str1 = str1;
	}
	
	public void displayData() {
		boolean bool1 = true;
		int int1 = 1000;
		float float1 = 200.56F;
		char char1 = '@';
		String str1 = "Java";
		
		bool1 = bool1;
		
		System.out.println(bool1);
		System.out.println(int1);
		System.out.println(float1);
		System.out.println(char1);
		System.out.println(str1);
	}

	public static void main(String[] args) {
		
		ParameterizedConstructor2 paramCons2 = new ParameterizedConstructor2(true, 100, 100.5F, 'A', "Hello");
		System.out.println(paramCons2.bool1);
		System.out.println(paramCons2.int1);
		System.out.println(paramCons2.float1);
		System.out.println(ParameterizedConstructor2.char1);
		System.out.println(ParameterizedConstructor2.str1);
		System.out.println("----------------------------------------------------");
		paramCons2.displayData();
		

	}

}

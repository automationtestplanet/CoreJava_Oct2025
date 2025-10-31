package oops.typecasting;

public class UpCastingAndDownCasting {

	public static void main(String[] args) {

		// datatype variable = value

		int int1 = 100; // smaller

		long long1 = 200; // bigger

		long1 = int1; // implicit conversion   100

		int1 = (int) long1; // explicit conversion

		Calculator calc = new Calculator(); // bigger		
		System.out.println(calc.addition(10, 20));
		System.out.println("-----------------------------------------------");
		
		NewCalculator newCalc = new NewCalculator(); // smaller
		System.out.println(newCalc.addition(10, 20));
		System.out.println(newCalc.modDivision(10, 3));
		
		System.out.println("-----------------------------------------------");
		
		Calculator calc2 = newCalc;     // Up-casting	
		System.out.println(calc2.addition(10, 20));
//		System.out.println(calc2.modDivision(10, 3));   // can not access
		
		System.out.println("-----------------------------------------------");
		
		newCalc = (NewCalculator) calc2;   // Down-casting
		System.out.println(newCalc.addition(10, 20));
		System.out.println(newCalc.modDivision(10, 3));
		
		System.out.println("-----------------------------------------------");
		
		Calculator calc3 = newCalc;
		System.out.println(calc3.addition(10, 20));  // called from child class overriding
		System.out.println(newCalc.addition(10, 20)); // called from child class overriding
		
		
		System.out.println("-----------------------------------------------");
		
		Calculator clac4 = new NewCalculator();   // Up-casting
		System.out.println(clac4.addition(10, 20));   // overriding
//		System.out.println(calc2.modDivision(10, 3));   // can not access
		
		System.out.println("-----------------------------------------------");
		
		NewCalculator newCalc2 = (NewCalculator)clac4;
		System.out.println(newCalc2.addition(10, 20));   // overriding
		System.out.println(newCalc2.modDivision(10, 3)); 
		
		
		System.out.println("-----------------------------------------------");
		Calculator clac5 = new NewCalculator();
		System.out.println(clac5.addition(10, 20));
		System.out.println(clac5.division(10, 3));    // static method can not override
		
		NewCalculator newCalc3 = (NewCalculator)clac5;
		System.out.println(newCalc3.addition(10, 20));
		System.out.println(newCalc3.division(10, 3)); 
		

	}
}

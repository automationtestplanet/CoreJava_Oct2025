package oops.encapsulation;

import oops.inheritance.Calculator;
import oops.inheritance.NewCalculator2;

public class UseCalculator extends Calculator {
	
	

	public static void main(String[] args) {
//		Calculator calc = new Calculator();

//		int result = calc.addition(10, 20);		
//		System.out.println("Addition: "+result);
//		
//		result = calc.subtraction(10, 20);
//		System.out.println("Subtraction: "+result);
//		
//		result = calc.multiplication(10, 20);
//		System.out.println("Multiplication: "+result);
//		
//		result = calc.division(10, 20);
//		System.out.println("Division: "+result);

//		NewCalculator newCalc = new NewCalculator();
//		
//		int result = newCalc.addition(10, 20);		
//		System.out.println("Addition: "+result);
//		
//		result = newCalc.subtraction(10, 20);
//		System.out.println("Subtraction: "+result);
//		
//		result = newCalc.multiplication(10, 20);
//		System.out.println("Multiplication: "+result);
//		
//		result = newCalc.division(10, 20);
//		System.out.println("Division: "+result);
//		
//		result = newCalc.modDivision(10, 20);
//		System.out.println("ModDivision: "+result);

		NewCalculator2 newCalc = new NewCalculator2();

		int result = newCalc.addition(10, 20);
		System.out.println("Addition 2 numbers: " + result);

//		result = newCalc.subtraction(10, 20);   // Protected
//		System.out.println("Subtraction: " + result);

//		result = newCalc.multiplication(10, 20);   // Private
//		System.out.println("Multiplication: "+result);

//		result = newCalc.division(10, 20);     // default
//		System.out.println("Division: " + result);

		result = newCalc.modDivision(10, 20);
		System.out.println("ModDivision: " + result);
		
		result = newCalc.addition(10, 20,30);
		System.out.println("Addition 3 numbers: " + result);
		
		
		
		UseCalculator useCalc = new UseCalculator();		
		
		useCalc.addition(10, 20);
		System.out.println("Addition 2 numbers: " + result);
		
		useCalc.subtraction(10, 20);   // Protected
		System.out.println("Subtraction: " + result);
		
//		result = newCalc.multiplication(10, 20);   // Private
//		System.out.println("Multiplication: "+result);
//
//		result = newCalc.division(10, 20);     // default
//		System.out.println("Division: " + result);
		
		
		Calculator calc = new Calculator();
		
		calc.addition(10, 20);
		System.out.println("Addition 2 numbers: " + result);
		
//		calc.subtraction(10, 20);   // Protected
//		System.out.println("Subtraction: " + result);
//		
//		result = calc.multiplication(10, 20);   // Private
//		System.out.println("Multiplication: "+result);
//
//		result = calc.division(10, 20);     // default
//		System.out.println("Division: " + result);

	}

}

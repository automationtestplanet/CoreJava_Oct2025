package demo;

import calculator.Calculator;
import calculator.UseCalculator;

//import calculator.ImplementsCalculator;

public class UseArithematicOperations {

	public static void main(String[] args) {
//		ImplementsCalculator impCalc = new ImplementsCalculator();   // can not import due to non public
		
//		Calculator calc = new Calculator();   // can not create the object of an interface
		
		Calculator calc = new UseCalculator();
		
		System.out.println(calc.addition(10, 20));
		System.out.println(calc.subtraction(10, 20));
		System.out.println(calc.multiplication(10, 20));
		System.out.println(calc.division(10, 20));
		System.out.println(calc.modDivision(10, 20));
			
	}

}

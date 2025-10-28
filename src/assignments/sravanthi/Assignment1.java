package assignments.sravanthi;

public class Assignment1 {

	// Write a program to chek the given number is Automorphic Number
	//Ex; 5 -> 5*5 = 25 is automorphic
	// ex: 4 -> 4*4 = 16 not auomorphic
	// ex: 6 -> 6*6 = 36 automorphic
	static boolean isAutomorphic(int num) {
		int square = num*num;
		String numString = String.valueOf(num);
		String sqrString = String.valueOf(square);
		return sqrString.endsWith(numString);

	}
	public static void main(String[] args) {
		int num=5;
		if(isAutomorphic(num)) {
			System.out.println(num+" is a autpmorphic number");
		}
		else {
			System.out.println(num+" is not a autpmorphic number");
		}
	}

}

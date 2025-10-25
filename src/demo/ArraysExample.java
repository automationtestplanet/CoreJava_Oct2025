package demo;

public class ArraysExample {

	public static void main(String[] args) {
		int[] intArr = {11,12,13,14,15};
		
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		System.out.println(intArr[3]);
		System.out.println(intArr[4]);
		
		System.out.println("Total Elements in the Array: "+intArr.length);
		
		int length = intArr.length;
		
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		System.out.println("---------------------------");
		
		for(int eachNumber : intArr) {
			System.out.println(eachNumber);
		}
		
		System.out.println("---------------------------");
		
		char[] charArr = {'A', 'a', '1', '$'};
		
		for(char eachChar : charArr) {
			System.out.println(eachChar);
		}
		
		System.out.println("---------------------------");
		
		String[] strArr = {"Hello", "This", "Is", "Java"};
		
		for(String eachStr : strArr) {
			System.out.println(eachStr);
		}
		
		System.out.println("---------------------------");
		int[] intArr2 = new int[5];
		intArr2[0] = 100;
		intArr2[1] = 200;
		intArr2[2] = 300;
		intArr2[3] = 400;
		intArr2[4] = 500;
		
		for(int eachNumber : intArr2) {
			System.out.println(eachNumber);
		}
		
		System.out.println("---------------------------");
		String[] strArr2 = new String[2];
		strArr2[0] = "Hello";
		strArr2[1] = "Java";
		
		for(String eachStr : strArr2) {
			System.out.println(eachStr);
		}
		
		System.out.println("---------------------------");
		int[][] twoDArray = {{10,20,30,40,50}, {100,200,300,400,500}, {1000,2000,3000,4000,5000}};
		
		for(int i=0; i< twoDArray.length; i++) {
			for(int j = 0; j<twoDArray[i].length; j++) {
				System.out.print(twoDArray[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("---------------------------");
		
		for(int[] eachArray : twoDArray) {
			for(int eachElement : eachArray) {
				System.out.print(eachElement+" ");
			}
			System.out.println("");
		}
		
		
	}

}

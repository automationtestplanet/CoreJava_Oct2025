package assignments.maheshwari;

public class Assignment1 {
	
	// Write a Java Program to print the Fibonacci series for given times
	//Ex: num: 5  -> 0 1 1 2 3 5 8
	// Ex: num: 4  -> 0 1 1 2 3 5
	public void fibonacciSeries(int num){
		int num1=0;
		int num2=1;
		for(int i=1;i<=num;i++){
			System.out.print(num1+" ");
			int res=num1+num2;
			num1=num2;
			num2=res;
	}

	public static void main(String[] args) {
		
Assignment1 fb= new Assignment();
		fb. fibonacciSeries(5);
	}

}

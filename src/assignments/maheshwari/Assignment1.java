package assignments.maheshwari;

public class Assignment1 {
	
	// Write a Java Program to print the Fibonacci series for given times
	//Ex: num: 5  -> 0 1 1 2 3 5 8
	// Ex: num: 4  -> 0 1 1 2 3 5
	public void fibonacci(int num){
		int num1=0;
		int num2=1;
		for(int i=1;i<=num;i++){
			System.out.println(num1+" ");
			int res=num1+num2;
			num1=num2;
			num2=res;
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment fb= new Assignment();
		fb.fibonacci(5);

	}

}

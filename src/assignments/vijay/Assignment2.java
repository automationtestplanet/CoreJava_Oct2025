package assignments.vijay;

public class Assignment2 {

	
	// Write a reusable program to print missed numbers in an array
	// ex: int[] arr = {1,2,5,7,9}  -> o/p: 3,4,6,8
	public static void MissedNumbersInArray(int[] arr) {
		
		boolean first = true;
		 
		for (int i =0; i < arr.length-1; i++) {
			for(int j =arr[i]+1; j <arr[i +1]; j++) {
				if (!first){
					System.out.print(",");
				}
				System.out.print(j);
				first = false;
			}
				
		}
		
	}
	
	public static void main(String[] args) {
		
		MissedNumbersInArray(new int[]{1,2,5,7,9});
		System.out.println();
		
		MissedNumbersInArray(new int[]{22,25,28});
		
		
	}

}

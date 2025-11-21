package assignments.sravanthi;

import java.util.Arrays;

public class Assignment2 {
	
	// Write a reusable program to sort an array in a reverse order
	// ex: int[] arr = {3,5,2,1,4} -> o/p: {5,4,3,2,1}

	public static void sortReverse(int[] arr) {
        Arrays.sort(arr); 


        System.out.print("Array in reverse order: {");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(+arr[i]);
            if(i !=0) {
            	System.out.print(",");
            }
        }System.out.println("}");
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3,0};

        sortReverse(numbers);
    }
}

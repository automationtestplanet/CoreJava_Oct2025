package assignments.maheshwari;

public class Assignment2 {

	// Write a program to sort an array in ascending order
	// ex: int[] arr = {3,5,2,1,4} -> o/p: {1,2,3,4,5}

	public  void arrayAcendingOrder(int [] arr) {
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
		}
		
	}
		for(int eachelement:arr) {
			System.out.print(eachelement+" ");
		}
	}
	public static void main(String[] args) {
		int [] arr1= {3,5,2,1,4};
		Assignment2 an= new Assignment2();
				an.arrayAcendingOrder(arr1);
	}
	

}

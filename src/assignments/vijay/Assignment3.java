package assignments.vijay;

public class Assignment3 {

	// Write a program to split the given sentence string to words and count each word length
	// ex: This Hello Java Program -> o/p: 4 5 4 7
	
	public static void  WordLengthCounter2(String sentence) {
		
		int count = 0;
		
		System.out.print("Word lengths: ");
		for(int i =0; i <sentence.length();i++) {
			char ch = sentence.charAt(i);
			
			if (ch != ' '){
				count++;		
			}else {
				System.out.print(count +" ");
				count = 0;
			}
		}
		System.out.print(count);
	}
	
	public static void main(String[] args) {
		String sentence = "This Hello Java Program";
		WordLengthCounter2(sentence);
	}
}


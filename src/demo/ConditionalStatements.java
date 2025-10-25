package demo;

public class ConditionalStatements {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		if(a < b) {
			System.out.println(a);
		}
		
		if(a > b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
		if(a > b) {
			System.out.println(a);
		}else if(a==b){
			System.out.println(b);
		}else if(b>a){
			System.out.println(b);
		}else {
			System.out.println("Both are not equals");
		}
		
		
		if(a>b) {
			if(a==b) {
				System.out.println("a equals to b");
			}else {
				System.out.println("a is lesser than b");
			}
		}else {
			if(a==b) {
				System.out.println("a equals to b");
			}else {
				System.out.println("b is greater than a");
			}
		}
		
		String str = "JAVA";
		
		switch (str) {
			case "HELLO": 
				System.out.println(str);
				break;
			
			case "Hello": 
				System.out.println(str);
				break;
			default:
				System.out.println("No match found");
				
		}

	}

}

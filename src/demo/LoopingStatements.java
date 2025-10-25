package demo;

public class LoopingStatements {

	public static void main(String[] args) {
		
//		System.out.println("Hello Java");
//		System.out.println("Hello Java");
//		System.out.println("Hello Java");
//		System.out.println("Hello Java");
//		System.out.println("Hello Java");
//		System.out.println("Hello Java");
//		System.out.println("Hello Java");
//		System.out.println("Hello Java");
//		System.out.println("Hello Java");
//		System.out.println("Hello Java");
		
		for(int i=0; i<10; i++) {
			System.out.println("Hello Java");
		}
		
		System.out.println("---------------------------");
		for(int i=1; i<=10; i++) {
			System.out.println(i+" X 968 = "+ (i*968));
		}
		
		System.out.println("---------------------------");
		
		int i = 1;
		
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("---------------------------");
		
		int j = 10;
		
		do {
			System.out.println(j);
			j++;
		}while(j<=20);
		
		System.out.println("---------------------------");
		
		for(int p = 1; p<=5; p++) {
			for(int q = 1; q<=p; q++) {
				System.out.print(p+" ");
			}
			System.out.println("");
		}
	}

}

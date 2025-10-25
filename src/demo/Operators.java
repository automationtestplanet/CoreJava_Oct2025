package demo;

public class Operators {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		System.out.println("-----------------Arithematic Operators-------------");
		
		System.out.println("Addition: "+(a+b));
		System.out.println("Subtraction: "+(a-b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Division: "+(a/b));
		System.out.println("Modular Division: "+(a%b));
		
		System.out.println("-----------------Assignment Operators-------------");
		int c = 300;
		
		c += 100;   // c = c+100;
		System.out.println(c);
		
		c-=50;
		System.out.println(c);
		
		c *= 2;
		System.out.println(c);
		
		c/=7;
		System.out.println(c);
		
		c%=3;		
		System.out.println(c);
		
		System.out.println("-----------------Incremental/Decremental Operators-------------");
		int d = 10;
		System.out.println(d);  // 10
		System.out.println(d++); // post increment  //10
		System.out.println(d);    // 11
		System.out.println(++d);  // pre-increment   // 12
		System.out.println(d--);  // post decrement;  // 12
		System.out.println(d);   // 11
		System.out.println(--d);   // pre-decrment   // 10
		
		System.out.println("-----------------Comparison Operators-------------");
		int x = 10;
		int y = 20;
		
		System.out.println(x<y);   // true
		System.out.println(x>y);   // false
		System.out.println(x==y);  // false
		System.out.println(x!=y);  // true
		System.out.println(x<=y);   // x<y or x==y  -> T or F  -> T  -> true
		System.out.println(x>=y);   // x>y or x==y  -> F or F  -> F  -> false
		
		boolean bool1 = x>=y;
		System.out.println(bool1);
		
		System.out.println("-----------------Logical Operators-------------");
		
		System.out.println(x<y || x>y || x==y || x!=y); // -> T|F|F|T -> T  -> true
		System.out.println(x<y && x>y && x==y && x!=y); // -> T|F|F|T -> F -> false
		System.out.println(!(x<y && x>y && x==y && x!=y));  //-> true
		
		System.out.println("-----------------Ternary Operators-------------");
		int p = 1000;
		int q = 2000;
		
		System.out.println((a<b)?true:false);   // true
		System.out.println((a<b)?a:b);   // 1000
		System.out.println((a<b)?"A is less than B":"b is less than A");   // A is less than B
		
		int e = (a<b)?a:b;
		System.out.println(e);
	}

}

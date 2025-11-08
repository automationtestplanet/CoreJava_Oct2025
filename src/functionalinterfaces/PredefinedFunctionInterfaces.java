package functionalinterfaces;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionInterfaces {

	public static void main(String[] args) {
		System.out.println("-----------------Function---------------");		
//		Function<T, R>
		
		Function<Integer, String> fun1 = new Function<Integer, String>() {			
			@Override
			public String apply(Integer val1) {
				return "Hello";
			}
		};		
		System.out.println(fun1.apply(100));
		
		Function<Integer, String> fun2 = (val1)-> "Java";
		System.out.println(fun2.apply(100));
		
		
		
		System.out.println("-----------------Bi-Function---------------");
//		BiFunction<T, U, R>
		
		BiFunction<Integer, Integer, Integer> biFun1 = new BiFunction<Integer, Integer, Integer>() {
			@Override
			public Integer apply(Integer val1, Integer val2) {
				return val1+val2;
			}
		};
		System.out.println(biFun1.apply(100,200));
		
		BiFunction<Integer, Integer, Integer> biFun2 = (val1,val2)-> val1+val2;
		System.out.println(biFun2.apply(1000,2000));
		
		
		System.out.println("-----------------BinaryOperator---------------");
//		BinaryOperator<T>
		BinaryOperator<String> biOp1 = new BinaryOperator<String>() {
			@Override
			public String apply(String str1, String str2) {
				return str1+str2;
			}
		};
		System.out.println(biOp1.apply("Hello","Java"));
		
		BinaryOperator<String> biOp2 = (str1,str2)-> str1+str2;
		System.out.println(biOp2.apply("Hello","Java"));
		
		System.out.println("-----------------Predicate---------------");
//		Predicate<T>
		
		Predicate<Integer> prdct1 = new Predicate<Integer>() {			
			@Override
			public boolean test(Integer val) {
				return val>100;
			}
		};
		System.out.println(prdct1.test(101));
		System.out.println(prdct1.test(100));
		
		Predicate<Integer> prdct2 = (val1)-> val1>100;
		System.out.println(prdct2.test(101));
		System.out.println(prdct2.test(100));
		
		
		System.out.println("-----------------Consumer---------------");
//		Consumer<T>
		
		Consumer<String> consum1 = new Consumer<String>() {
			@Override
			public void accept(String val1) {
				System.out.println(val1);
			}
		};		
		consum1.accept("Hello");
		
		Consumer<String> consum2 = (val1)-> System.out.println(val1);
		consum2.accept("Java");
		
		
		System.out.println("-----------------Supplier---------------");
//		Supplier<T>
		
		Supplier<Integer> suplr1 = new Supplier<Integer>() {			
			@Override
			public Integer get() {
				return 1000;
			}
		};		
		System.out.println(suplr1.get());
		
		Supplier<Integer> suplr2 = () -> 10000;
		System.out.println(suplr2.get());
		
		System.out.println("-----------------Comparator---------------");
//		Comparator<T>
		
		Comparator<Integer> comp1 = new Comparator<Integer>() {			
			@Override
			public int compare(Integer val1, Integer val2) {
				if(val1>val2)
					return -1;
				else
					return 0;
			}
		};
		System.out.println(comp1.compare(100, 99));
		
		Comparator<Integer> comp2 = (val1,val2)->{if(val1>val2) return -1;else return 0;};
		System.out.println(comp2.compare(100, 99));

	}

}

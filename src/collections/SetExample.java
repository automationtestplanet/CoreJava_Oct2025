package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		System.out.println("----------------------HashSet------------------");
		Set hashSet1 = new HashSet();
		hashSet1.add(100);
		hashSet1.add(1000);
		hashSet1.add(10000);
		hashSet1.add(100000L);
		hashSet1.add(100.5F);
		hashSet1.add(100.534E54D);
		hashSet1.add('A');
		hashSet1.add("Hello");
		hashSet1.add(true);
		hashSet1.add(new SetExample());
		
		System.out.println(hashSet1);
//		System.out.println(hashSet1.get(0));
		
		hashSet1.add("Hello");
		System.out.println(hashSet1);
		
		System.out.println("----------------------LinkedHashSet------------------");

		Set linkedHashSet1 = new LinkedHashSet();
		linkedHashSet1.add(100);
		linkedHashSet1.add(1000);
		linkedHashSet1.add(10000);
		linkedHashSet1.add(100000L);
		linkedHashSet1.add(100.5F);
		linkedHashSet1.add(100.534E54D);
		linkedHashSet1.add('A');
		linkedHashSet1.add("Hello");
		linkedHashSet1.add(true);
		linkedHashSet1.add(new SetExample());
		
		System.out.println(linkedHashSet1);

		System.out.println("----------------------TreeSet------------------");
		
		Set treeSet1 = new TreeSet();
//		treeSet1.add(10000);
//		treeSet1.add(100000L);
//		treeSet1.add(100.5F);
//		treeSet1.add(100.534E54D);
//		treeSet1.add('A');
//		treeSet1.add("Hello");
//		treeSet1.add(true);
		
		treeSet1.add(14);
		treeSet1.add(12);
		treeSet1.add(15);
		treeSet1.add(11);
		treeSet1.add(13);
		
		System.out.println(treeSet1);
		
		Set treeSet2 = new TreeSet();
		treeSet2.add('D');
		treeSet2.add('B');
		treeSet2.add('E');
		treeSet2.add('A');
		treeSet2.add('C');
		
		System.out.println(treeSet2);
		
		Set treeSet3 = new TreeSet();
		treeSet3.add("Cherry");
		treeSet3.add("Apple");
		treeSet3.add("Banana");
		
		System.out.println(treeSet3);
	
		

	}

}

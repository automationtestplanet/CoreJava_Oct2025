package collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperations {

	public static void main(String[] args) {
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
			
		System.out.println(hashSet1.contains(100));		
		System.out.println(hashSet1.size());
		System.out.println(hashSet1.isEmpty());	
		
		hashSet1.remove(true);
		
//		hashSet1.clear();
		
		System.out.println(hashSet1);
		
		System.out.println(hashSet1.equals(hashSet1));
		
		for(Object eachObject : hashSet1) {
			System.out.println(eachObject);
		}

	}

}

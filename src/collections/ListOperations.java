package collections;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {

	public static void main(String[] args) {
		List arrayList1 = new ArrayList();
		arrayList1.add(100);
		arrayList1.add(1000);
		arrayList1.add(10000);
		arrayList1.add(100000L);
		arrayList1.add(100.5F);
		arrayList1.add(100.534E54D);
		arrayList1.add('A');
		arrayList1.add("Hello");
		arrayList1.add(true);
		
		System.out.println(arrayList1.get(0));
		int int1 = (int) arrayList1.get(0);		
		System.out.println(arrayList1.contains(100));		
		System.out.println(arrayList1.size());
		System.out.println(arrayList1.isEmpty());
		
		List list2 = arrayList1.subList(0, 3);
		System.out.println(list2);
		
		list2.clear();
		
		System.out.println(list2);
		
		System.out.println(arrayList1.equals(list2));
		
		for(Object eachObject : arrayList1) {
			System.out.println(eachObject);
		}
	}

}

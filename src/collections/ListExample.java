package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
//		List list1 = new List();

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
		arrayList1.add(new ListExample());
		
		System.out.println(arrayList1);
		System.out.println(arrayList1.get(0));
		System.out.println(arrayList1.get(5));
		
		arrayList1.add("Hello");
		System.out.println(arrayList1);
		
		
		

		List linkedList1 = new LinkedList();
		linkedList1.add(100);
		linkedList1.add(1000);
		linkedList1.add(10000);
		linkedList1.add(100000L);
		linkedList1.add(100.5F);
		linkedList1.add(100.534E54D);
		linkedList1.add('A');
		linkedList1.add("Hello");
		linkedList1.add(true);
		linkedList1.add(new ListExample());
	}

}

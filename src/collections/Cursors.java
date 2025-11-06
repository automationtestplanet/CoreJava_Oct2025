package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Cursors {

	public static void main(String[] args) {
		List arrayList1 = new ArrayList();
		arrayList1.add(100);
		arrayList1.add(100.5F);
		arrayList1.add('A');
		arrayList1.add("Hello");
		arrayList1.add(true);

		Iterator itr1 = arrayList1.iterator();

		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println("------------------------------------------");

		ListIterator listItr1 = arrayList1.listIterator();

//		System.out.println(listItr1.next());
//		System.out.println(listItr1.next());
//		System.out.println(listItr1.previous());
//		System.out.println(listItr1.previous()); 

		while (listItr1.hasNext()) {
			System.out.println(listItr1.next());
		}

		while (listItr1.hasPrevious()) {
			System.out.println(listItr1.previous());
		}

		System.out.println("--------------------------------------------------");
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
		
		Iterator setItr = hashSet1.iterator();
		while(setItr.hasNext()) {
			System.out.println(setItr.next());
		}
	}

}

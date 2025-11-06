package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneriCollections {

	public static void main(String[] args) {
		List arrayList1 = new ArrayList();
		arrayList1.add(100);
		arrayList1.add(100.5F);
		arrayList1.add('A');
		arrayList1.add("Hello");
		arrayList1.add(true);

		System.out.println(arrayList1);

		int int1 = (int) arrayList1.get(0);
		System.out.println(int1);

		int int2 = (int) arrayList1.get(1);
		int int3 = (int) arrayList1.get(2);
		int int4 = (int) arrayList1.get(3);
		int int5 = (int) arrayList1.get(4);
		
		

	}

}

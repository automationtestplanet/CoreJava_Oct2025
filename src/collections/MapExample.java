package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {

		System.out.println("--------------------HashMap--------------------");
		Map hashMap1 = new HashMap();

		hashMap1.put("FirstName", "Raju");
		hashMap1.put("Age", 100);
		hashMap1.put(100, "Age");
		hashMap1.put(100, 100);
		hashMap1.put(true, false);
		hashMap1.put(null, "Null");   // One null key is allowed
		hashMap1.put("Null", null);   // multiple null values allowed

		System.out.println(hashMap1);
		System.out.println(hashMap1.get("FirstName"));

		System.out.println("--------------------LinkedHashMap--------------------");
		Map linkedHashMap1 = new LinkedHashMap();
		linkedHashMap1.put("FirstName", "Raju");
		linkedHashMap1.put("Age", 100);
		linkedHashMap1.put(100, "Age");
		linkedHashMap1.put(100, 100);
		linkedHashMap1.put(true, false);
		System.out.println(linkedHashMap1);

		System.out.println("--------------------TreeMap--------------------");
		Map treeMap1 = new TreeMap();
		treeMap1.put("FirstName", "Raju");
		treeMap1.put("Age", 100);
		treeMap1.put("LastName", "Chelle");
		treeMap1.put("Education", "MCA");

		System.out.println(treeMap1);

		System.out.println("--------------------TreeMap--------------------");
		Map hashtable = new Hashtable();
		hashtable.put("FirstName", "Raju");
		hashtable.put("Age", 100);
		hashtable.put(100, "Age");
		hashtable.put(100, 100);
		hashtable.put(true, false);
//		hashtable.put(null, "Null");   // Null Keys not allowed
		hashtable.put("Null", null);  // Null Values not allowed
		
		System.out.println(hashtable);
		

	}

}

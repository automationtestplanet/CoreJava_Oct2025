package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		
		System.out.println("--------------------HashMap--------------------");
		Map HashMap1 = new HashMap();
		
		HashMap1.put("FirstName", "Raju");
		HashMap1.put("Age", 100);
		HashMap1.put(100, "Age");
		HashMap1.put(100, 100);
		HashMap1.put(true, false);
		
		
		System.out.println(HashMap1);
		System.out.println(HashMap1.get("FirstName"));

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

		Map hashtable = new Hashtable();

	}

}

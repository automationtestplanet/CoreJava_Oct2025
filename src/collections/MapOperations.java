package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapOperations {

	public static void main(String[] args) {
		Map HashMap1 = new HashMap();
		HashMap1.put("FirstName", "Raju");
		HashMap1.put("Age", 100);
		HashMap1.put(100, "Age");
		HashMap1.put(100, 100);
		HashMap1.put(true, false);
		
		System.out.println(HashMap1.size());
		System.out.println(HashMap1.get("FirstName"));
		System.out.println(HashMap1.get("LastName"));
		
		System.out.println(HashMap1.containsKey("FirstName"));
		System.out.println(HashMap1.containsKey("LastName"));
		System.out.println(HashMap1.containsValue(100));
		System.out.println(HashMap1.containsValue("Raju"));
		System.out.println(HashMap1.containsValue(200));
		
		System.out.println(HashMap1.isEmpty());
		
		Set keysSet =  HashMap1.keySet();
		System.out.println(keysSet);
		
		System.out.println(HashMap1.values());
		
		Set<Map.Entry> allEntries = HashMap1.entrySet();
		System.out.println(allEntries);
		
		for(Map.Entry eachEntry:allEntries) {
			System.out.println(eachEntry);
			System.out.println(eachEntry.getKey() + "    "+ eachEntry.getValue());
		}
		
		

	}

}

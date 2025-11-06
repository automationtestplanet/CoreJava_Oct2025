package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GenericCollectionsExample {

	public static void main(String[] args) {
		List<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(15);
//		numbersList.add("Hello");
		numbersList.add(14);
		numbersList.add(11);
		numbersList.add(13);
		numbersList.add(12);

		System.out.println(numbersList);

		int int1 = numbersList.get(1);

		List<String> stringsList = new ArrayList<>();
		stringsList.add("Apple");
//		stringsList.add(10);
		stringsList.add("Banana");
		stringsList.add("Cherry");

		String str1 = stringsList.get(0);
		System.out.println(stringsList);

		Map<String, Integer> fruitsMap = new HashMap<>();
		fruitsMap.put("Apple", 10);
		fruitsMap.put("Banana", 30);
		fruitsMap.put("Cherry", 50);
//		fruitsMap.put(10, 50);
//		fruitsMap.put("Dragon", "10");
		fruitsMap.put(null, 50);
		fruitsMap.put("PineApple", null);

		System.out.println(fruitsMap);
		int applesCount = fruitsMap.get("Apple");
		System.out.println(applesCount);

		for (Map.Entry<String, Integer> eachEntry : fruitsMap.entrySet()) {
			System.out.println(eachEntry.getKey() + "  " + eachEntry.getValue());
		}

		System.out.println("-----------------------------------");
		Iterator<String> fruitsItr = stringsList.iterator();
		while (fruitsItr.hasNext()) {
			if (fruitsItr.next().equalsIgnoreCase("Banana"))
				System.out.println("Banana");
		}
		
		System.out.println("--------------------------------------------------");
		
	}

}

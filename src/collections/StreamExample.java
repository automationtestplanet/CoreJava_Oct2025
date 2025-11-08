package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(15);
		numbersList.add(14);
		numbersList.add(11);
		numbersList.add(13);
		numbersList.add(12);
//		
//		for(int eachNum : numbersList) {
//			if(eachNum%2==0)
//				System.out.println(eachNum);
//		}

		numbersList.stream().filter(eachVal -> eachVal % 2 == 0).forEach(eachVal -> System.out.println(eachVal));
		numbersList.stream().filter(eachVal -> eachVal % 2 == 0).forEach(System.out::println);

		List<Integer> filteredList = numbersList.stream().filter(eachVal -> eachVal % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(filteredList);

		var filteredList2 = numbersList.stream().filter(eachVal -> eachVal % 2 == 0).collect(Collectors.toList());
		System.out.println(filteredList2);

		var mappedLsit = numbersList.stream().map(eachVal1 -> eachVal1 * 5).collect(Collectors.toList());
		System.out.println(mappedLsit);

		int sum = numbersList.stream().reduce(0, (val1, val2) -> val1 + val2);
		System.out.println(sum);
	}

}

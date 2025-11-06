package collections;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(15);
		numbersList.add(14);
		numbersList.add(11);
		numbersList.add(13);
		numbersList.add(12);
		
		for(int eachNum : numbersList) {
			if(eachNum%2==0)
				System.out.println(eachNum);
		}
		

	}

}

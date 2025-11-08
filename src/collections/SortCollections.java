package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCollections {

	public static void main(String[] args) {

		int[] intArr = { 155, 144, 111, 133, 122 };
		Arrays.sort(intArr);

		for (int eachVal : intArr)
			System.out.print(eachVal + " ");
		System.out.println("");

		List<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(15);
		numbersList.add(14);
		numbersList.add(11);
		numbersList.add(13);
		numbersList.add(12);

		System.out.println(numbersList);

		Collections.sort(numbersList);
		System.out.println(numbersList);

		Collections.sort(numbersList, Collections.reverseOrder());
		System.out.println(numbersList);

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Ram", 103, 90000));
		empList.add(new Employee("Krish", 101, 85000));
		empList.add(new Employee("Venkat", 102, 100000));

		empList.forEach(eachEmp -> System.out
				.println(eachEmp.getEmpId() + " " + eachEmp.getName() + " " + eachEmp.getSalary()));
//		Collections.sort(empList);
		System.out.println("---------------------");
		Collections.sort(empList, (empObj1, empObj2) -> {
			if (empObj1.getEmpId() > empObj2.getEmpId())
				return 0;
			else
				return -1;
		});
		empList.forEach(eachEmp -> System.out
				.println(eachEmp.getEmpId() + " " + eachEmp.getName() + " " + eachEmp.getSalary()));

		System.out.println("---------------------");

		Collections.sort(empList, (empObj1, empObj2) -> {
			if (empObj1.getSalary() > empObj2.getSalary())
				return 0;
			else
				return -1;
		});
		empList.forEach(eachEmp -> System.out
				.println(eachEmp.getEmpId() + " " + eachEmp.getName() + " " + eachEmp.getSalary()));

		System.out.println("--------------------------------");
		Collections.sort(empList);
		empList.forEach(eachEmp -> System.out
				.println(eachEmp.getEmpId() + " " + eachEmp.getName() + " " + eachEmp.getSalary()));

	}

}

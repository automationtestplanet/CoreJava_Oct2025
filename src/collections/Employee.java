package collections;

public class Employee implements Comparable<Employee> {
	private String name;
	private int empId;
	private int salary;

	public Employee(String name, int empId, int salary) {
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getEmpId() {
		return empId;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public int compareTo(Employee empObj) {
		if (empObj.getName().charAt(0) < this.getName().charAt(0))
			return 0;
		else
			return -1;
	}
}

package demo;

public class UseStudentClass {
	
	int a = 100;
	
	void method1() {
		System.out.println("This is Use tudent Class");
	}

	public static void main(String[] args) {
		Student student1 = new Student("RAM", 1001, "Chaitanya", "10th Class");
		student1.displayStudentDetails();
		System.out.println(student1.rollNum);
		
		UseStudentClass useStd = new UseStudentClass();
		useStd.method1();
		System.out.println(useStd.a);

	}

}

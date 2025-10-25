package demo;

public class Student2 {

	String studentName;
	int rollNum;
	final static String COLLEGE_NAME = "Chaitanya";
	static String className;

	public Student2(String studentName1, int rollNum1, String className1) {
		this.studentName = studentName1;
		this.rollNum = rollNum1;
		Student2.className = className1;
	}

	public void displayStudentDetails() {
		System.out.println("StudentName: " + this.studentName);
		System.out.println("Roll Number: " + this.rollNum);
		System.out.println("College Name: " + Student2.COLLEGE_NAME);
		System.out.println("Class Name: " + Student2.className);
	}

	public static void main(String[] args) {
		Student2 student1 = new Student2("RAM", 1001, "10th Class");
		student1.displayStudentDetails();

		System.out.println(student1.studentName);
		System.out.println(student1.rollNum);
		System.out.println(Student2.COLLEGE_NAME);
		System.out.println(Student2.className);

//		System.out.println(this.studentName);
//		System.out.println(this.rollNum);

		System.out.println("-----------------------------------------------------");

		Student2 student2 = new Student2("KRISH", 1002, "10th Class");
		student2.displayStudentDetails();

		System.out.println("-----------------------------------------------------");

		Student2 student3 = new Student2("VENKAT", 1003, "10th Class");
		student3.displayStudentDetails();

	}

}

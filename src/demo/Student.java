package demo;

public class Student {

	String studentName;
	int rollNum;
	static String collegeName;
	static String className;

	public Student(String studentName1, int rollNum1, String collegeName1, String className1) {
		this.studentName = studentName1;
		this.rollNum = rollNum1;
		Student.collegeName = collegeName1;
		Student.className = className1;
	}

	public void displayStudentDetails() {
		System.out.println("StudentName: " + this.studentName);
		System.out.println("Roll Number: " + this.rollNum);
		System.out.println("College Name: " + Student.collegeName);
		System.out.println("Class Name: " + Student.className);
	}

	public static void main(String[] args) {
		Student student1 = new Student("RAM", 1001, "Chaitanya", "10th Class");
		student1.displayStudentDetails();
		
		System.out.println(student1.studentName);
		System.out.println(student1.rollNum);
		System.out.println(Student.collegeName);
		System.out.println(Student.className);
		
//		System.out.println(this.studentName);
//		System.out.println(this.rollNum);
		
		System.out.println("-----------------------------------------------------");
		
		Student student2 = new Student("KRISH", 1002, "Chaitanya", "10th Class");		
		student2.displayStudentDetails();
		
		System.out.println("-----------------------------------------------------");
		
		Student student3 = new Student("VENKAT", 1003, "Chaitanya", "10th Class");
		student3.displayStudentDetails();

	}

}

package oops.encapsulation;

public class Student {
	
	private String studentName;
	private int rollNum;
	private static String collegeName;
	private static String className;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}

	public static String getClassName() {
		return className;
	}

	public static void setClassName(String className) {
		Student.className = className;
	}

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
}

package oops.encapsulation;

public class UseStudent {
	
	public static void main(String[] args) {
		Student student1 = new Student("RAM", 1001, "Chaitanya", "10th Class");
		
		
		System.out.println(student1.getStudentName());
		System.out.println(student1.getRollNum());
		System.out.println(Student.getCollegeName());
		System.out.println(Student.getClassName());
		
		System.out.println("-----------------------------------------------------");
		student1.setStudentName("RAMS");
		student1.displayStudentDetails();
		
		System.out.println("-----------------------------------------------------");
		
		Student student2 = new Student("KRISH", 1002, "Chaitanya", "10th Class");		
		student2.displayStudentDetails();
		
		System.out.println("-----------------------------------------------------");
		
		Student student3 = new Student("VENKAT", 1003, "Chaitanya", "10th Class");
		student3.displayStudentDetails();
	}

}

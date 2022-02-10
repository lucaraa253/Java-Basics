package ConstructorDemo;

public class Student {
	
	
	int studentId;
	String studentName;
	int marks;
	int grade;
	
	public Student() {
		studentId = 1;
		studentName = "Jimmy";
		marks = -1;
		grade = -1;
	}
	
	
	
	public Student(int studentId, String studentName, int marks, int grade) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		this.grade = grade;
	}

	

	public Student(int studentId, String studentName) {
		this();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public void printStudentDetails() {
		System.out.println("Student ID is : " + studentId);
		System.out.println("The students name is : " + studentName);
		System.out.println("The current marks score is : " + marks);
		System.out.println("The student current grade is : " + grade);
	}

	public static void main(String[] args) {
		
		System.out.println("----------------Student # 1 -----------------");
		Student student1 = new Student();
		student1.printStudentDetails();
		
		System.out.println("----------------Student # 2 -----------------");
		Student student2 = new Student(2, "Kayla", 5, 4);
		student2.printStudentDetails();
		
		System.out.println("----------------Student # 3 -----------------");
		Student student3 = new Student(3, "John");
		student3.printStudentDetails();

	}

}

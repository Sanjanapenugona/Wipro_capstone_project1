package Assesement_day5;

public class Student {
	private String name;
	private int rollno;
	private int marks;
	void details(String name,int rollno, int marks)
	{
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
		System.out.println("Student Name=" +name);
		System.out.println("Student Rollno="+rollno);
		System.out.println("Student Marks=" +marks);
	}

	public static void main(String[] args) {
		Student sd = new Student();
		sd.details("sanjana",482,782);	

	}

}

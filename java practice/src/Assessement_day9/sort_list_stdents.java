package Assessement_day9;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int rollNo;
    String name;
    float marks;

    public Student(int rollNo, String name,float marks) {
        this.rollNo = rollNo;
        this.name   = name;
        this.marks  = marks;
    }

    public int compareTo(Student other) {
        return Integer.compare(this.rollNo, other.rollNo);
    }

    public String toString() {
        return rollNo + " " + name + " " + marks;
    }
}

public class sort_list_stdents {

	public static void main(String[] args) {
		 Student[] students = {
		            new Student(5, "ABC", 85F),
		            new Student(2, "DEF", 90F),
		            new Student(8, "GHI", 78F),
		            new Student(1, "JKL", 92F)
	                };

		        System.out.println("Before Sorting:");
		        for (Student student : students) {
		            System.out.println(student);
		        }

		        Arrays.sort(students);

		        System.out.println("\nAfter Sorting:");
		        for (Student student : students) {
		            System.out.println(student);
		        }
	 }

}

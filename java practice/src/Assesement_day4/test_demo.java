package Assesement_day4;
abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract String getRoleInfo();
}

class Student extends Person {
    String course;

    Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    String getRoleInfo() {
        return "Student: " + name + ", Age: " + age + ", Course: " + course;
    }
}

public class test_demo  {
    public static void main(String[] args) {
        Person student = new Student("Sanjana", 20, "B.Tech");
        System.out.println(student.getRoleInfo());



	}

}

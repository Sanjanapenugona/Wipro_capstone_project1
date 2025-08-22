package Assessment_day7;
class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


public class Pass_object {

	public static void main(String[] args) {
		Employee emp = new Employee("Sanjana", 20);
        System.out.println("Before modification:");
        emp.printDetails();

        modifyEmployee(emp);

        System.out.println("After modification:");
        emp.printDetails();
    }

    public static void modifyEmployee(Employee emp) {
        emp.name = "Sanjana";
        emp.age = 25;
        System.out.println("Inside modifyEmployee method:");
        emp.printDetails();
    }
}

	


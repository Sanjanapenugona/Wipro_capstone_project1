package Assessement_day9;
import java.util.Arrays;

class Employee implements Comparable<Employee> {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
}

public class employee_class {

	public static void main(String[] args) {
		 Employee[] employees = {
		            new Employee("Sanjana"),
		            new Employee("Sri"),
		            new Employee("Dhana"),
		            new Employee("Penugonda")
		        };

		        System.out.println("Before Sorting");
		        System.out.println(Arrays.toString(employees));

		        Arrays.sort(employees);

		        System.out.println("\nAfter Sorting");
		        System.out.println(Arrays.toString(employees));

	}

}

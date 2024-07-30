// ? Only one public class per file
class Employee {

    // Attributes
    int id;
    String name;
    int salary;

    // Methods
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public int getSalary() {
        return salary;
    }
}

public class CustomClass {
    public static void main(String[] args) {
        System.out.println("Welcome to my Custom Class!");

        // Instantiation
        Employee emp = new Employee();

        // Setting Properties
        emp.id = 1;
        emp.name = "Anonymous";
        emp.salary = 123456789;

        // Calling Methods
        emp.printDetails();
    }
}

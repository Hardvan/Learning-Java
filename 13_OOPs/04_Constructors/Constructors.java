// ? Constructor
// * A member function used to initialize the object
// * Same name as class
// * No return type
// * Can be overloaded

class MyEmployee {

    private int id;
    private String name;

    // ? Constructors (Overloaded)
    // Default Constructor
    public MyEmployee() {
        this.id = 42;
        name = "Default-Name";
    }

    // Parameterized Constructor
    public MyEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters & Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Constructors {
    public static void main(String[] args) {

        MyEmployee emp = new MyEmployee();
        System.out.println("Default Constructor");
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());

        MyEmployee emp2 = new MyEmployee(42, "Rahul");
        System.out.println("\nParameterized Constructor");
        System.out.println("ID: " + emp2.getId());
        System.out.println("Name: " + emp2.getName());
    }
}

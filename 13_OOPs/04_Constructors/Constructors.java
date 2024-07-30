class MyEmployee2 {

    // ? Constructor
    // * A member function used to initialize the object
    // * Same name as class
    // * No return type
    // * Can be overloaded

    // Attributes
    private int id;
    private String name;

    // ? Constructors (Overloaded)
    // Default Constructor
    public MyEmployee2() {
        this.id = 42;
        name = "Default-Name";
    }

    // Parameterized Constructor
    public MyEmployee2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy Constructor
    public MyEmployee2(MyEmployee2 emp) {
        this.id = emp.id;
        this.name = emp.name;
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
        MyEmployee2 emp = new MyEmployee2();
        System.out.println("Default Constructor");
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());

        MyEmployee2 emp2 = new MyEmployee2(100, "Rahul");
        System.out.println("\nParameterized Constructor");
        System.out.println("ID: " + emp2.getId());
        System.out.println("Name: " + emp2.getName());

        MyEmployee2 emp3 = new MyEmployee2(emp2);
        System.out.println("\nCopy Constructor");
        System.out.println("ID: " + emp3.getId());
        System.out.println("Name: " + emp3.getName());
    }
}

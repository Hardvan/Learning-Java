// ? Constructor
// * A member function used to initialize the object
// * Same name as the class
// * No return type
// * Can be overloaded

class MyEmployee {

    private int id;
    private String name;

    // ? Constructors (Overloaded)
    public MyEmployee() {
        this.id = 42;
        name = "Default-Name";
    }

    public MyEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

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

        System.out.println(emp.getId());
        System.out.println(emp.getName());

        MyEmployee emp2 = new MyEmployee(42, "Rahul");
        System.out.println(emp2.getId());
        System.out.println(emp2.getName());

    }
}

// ? Access Modifier
// * Specifies where the class, method, or field can be accessed

// * Four types
// * private - within the declared class
// * protected - within the declared class and subclasses
// * default - within the declared class and package
// * public - accessible from anywhere

class MyEmployee {

    // ? Private variables
    private int id;
    private String name;
    private int temp; // For testing

    // ? Setters and Getters
    public void setId(int id) {
        this.id = id; // ? 'this' refers to the current object
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

public class AccessModifiers {
    public static void main(String[] args) {

        MyEmployee emp = new MyEmployee();

        // Error due to private access modifier
        // emp.id = 1;
        // emp.name = "Bob";

        emp.setId(1);
        emp.setName("Bob");
    }
}

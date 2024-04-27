// ? Inheritance
// * One class can inherit properties & methods from another class
// * SubClass extends SuperClass

// ? 'extends' keyword

// ? super
// * Keyword that refers the immediate parent class

class Base {

    int x;

    Base() {
        System.out.println("I am a default constructor in Base class");
    }

    Base(int x) {
        System.out.println("I am a parameterized constructor in Base class with value x: " + x);
        this.x = x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void printMe() {
        System.out.println("I am a print method in Base class");
    }
}

// ? Derived Class
class Derived extends Base {

    int y;

    Derived() {
        System.out.println("I am a default constructor in Derived class");
    }

    Derived(int x, int y) {
        super(x); // ? Call Base Class Constructor
        System.out.println("I am a parameterized constructor in Derived class with value y: " + y);
        this.y = y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

public class Inheritance {
    public static void main(String[] args) {

        System.out.println("=== Base Class ===");
        Base b = new Base();
        b.setX(10);
        System.out.println("X: " + b.getX());

        System.out.println("\n=== Derived Class ===");
        Derived d = new Derived();
        // First Base Constructor is called
        // Then Derived Constructor is called

        d.setX(20);
        d.setY(30);
        System.out.println("X: " + d.getX());
        System.out.println("Y: " + d.getY());

        System.out.println("\n=== Derived Class with Parameters ===");
        Derived d2 = new Derived(40, 50);
        System.out.println("X: " + d2.getX());
        System.out.println("Y: " + d2.getY());
    }
}

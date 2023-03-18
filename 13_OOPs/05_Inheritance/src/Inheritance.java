// ? Inheritance
// * One class can inherit properties & methods from another class
// * SubClass extends SuperClass

// ? 'extends' keyword

// ? super
// * Keyword that refers the immediate parent class

class Base {

    int x;

    Base() {
        System.out.println("I am a constructor in Base class");
    }

    Base(int x) {
        System.out.println("I am a constructor in Base class with value x: " + x);
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
        System.out.println("I am a constructor in Derived class");
    }

    Derived(int x, int y) {
        super(x); // ? Call Base Class Constructor
        System.out.println("I am a constructor in Derived class with value y: " + y);
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

        Base b = new Base();
        b.setX(10);
        System.out.println(b.getX());

        Derived d = new Derived();
        // First Base Constructor is called
        // Then Derived Constructor is called

        d.setX(20);
        d.setY(30);
        System.out.println(d.getX());
        System.out.println(d.getY());

        Derived d2 = new Derived(40, 50);

    }
}

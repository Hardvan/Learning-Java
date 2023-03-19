// ? Abstract Method
// * Method that is declared without an implementation

// ? Abstract Class
// * Class includes abstract methods
// * Even one abstract method makes the class abstract
// * Used to provide a common definition of a base class that multiple derived classes can share
// Eg: Shape class is a base class for Circle, Rectangle, Triangle, etc.

// Possible to create a reference of an abstract class
// But cannot create an object of an abstract class

// Abstract Class
abstract class Parent {

    public Parent() {
        System.out.println("I am a constructor of Parent class");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    // Abstract method
    abstract public void greet(); // or public abstract void greet(); --> Preferred

}

class Child extends Parent {

    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

}

abstract class Child2 extends Parent {

    public void th() {
        System.out.println("Good Morning");
    }
}

public class Abstract {
    public static void main(String[] args) {

        Parent p = new Parent(); // Error because Parent is abstract class

        Child c = new Child();
        c.greet(); // Good Morning

        Child2 c2 = new Child2(); // Error because Child2 is abstract class

    }
}
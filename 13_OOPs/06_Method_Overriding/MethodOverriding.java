// ? Method Overriding
// * Occurs when a child class has the same method as the parent class
// * Runtime (Dynamic) Polymorphism
// * Arguments and return type MUST BE THE SAME

class A {
    public int a;

    public int fun1() {
        return 1;
    }

    public void fun2() {
        System.out.println("I am method 2 of class A");
    }
}

class B extends A {
    // @Override: Indicates that a method declaration is intended to override a
    // method declaration in a supertype.
    // Useful for clarifying overriding methods
    @Override
    public void fun2() {
        System.out.println("I am overridden method 2 of class B");
    }

    public void fun3() {
        System.out.println("I am method 3 of class B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("Calling method 2 of class A:");
        a.fun2(); // Method 2 of class A

        B b = new B();
        System.out.println("\nCalling method 2 of class B:");
        b.fun2(); // Method 2 of class B
    }
}

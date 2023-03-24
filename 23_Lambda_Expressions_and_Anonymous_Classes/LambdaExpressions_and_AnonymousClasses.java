// ? Lambda Expressions
// * Let us express instances of single method interfaces with lambda expressions
// * Lambda expressions are anonymous functions

// ? Anonymous Classes
// * Used to implement a base class without giving it a name.

interface DemoAno {
    void meth1();

    void meth2();
}

interface DemoAno2 {
    void meth1();
}

interface DemoAno3 {
    void meth1(int a);
}

class AnonymousClass implements DemoAno {

    public void display() {
        System.out.println("Anonymous Class");
    }

    @Override
    public void meth1() {
        System.out.println("I am meth1");
    }

    @Override
    public void meth2() {
        System.out.println("I am meth2");
    }

}

public class LambdaExpressions_and_AnonymousClasses {

    public static void main(String[] args) {

        // AnonymousClass ano = new AnonymousClass(); // Normal way
        // ano.display();
        // ano.meth1();
        // ano.meth2();

        DemoAno obj = new DemoAno() { // Anonymous Class

            @Override
            public void meth1() {
                System.out.println("I am meth1");
            }

            @Override
            public void meth2() {
                System.out.println("I am meth2");
            }
        };
        obj.meth1();
        obj.meth2();

        // Lambda Expressions

        // No parameters
        DemoAno2 obj2 = () -> { // Only for single method interfaces (functional interfaces)
            System.out.println("I am meth1");
        };
        obj2.meth1();

        // With parameters
        DemoAno3 obj3 = (a) -> {
            System.out.println("I am meth1" + a);
        };
        obj3.meth1(5);

    }
}

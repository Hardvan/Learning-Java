// ? Lambda Expressions
// * Let us express instances of single method interfaces with lambda expressions
// * Lambda expressions are anonymous functions

// ? Anonymous Classes
// * Used to implement a base class without giving it a name.

interface DemoAno {
    void fun1();

    void fun2();
}

interface DemoAno2 {
    void fun1();
}

interface DemoAno3 {
    void fun1(int a);
}

class AnonymousClass implements DemoAno {

    public void display() {
        System.out.println("Anonymous Class");
    }

    @Override
    public void fun1() {
        System.out.println("I am fun1");
    }

    @Override
    public void fun2() {
        System.out.println("I am fun2");
    }

}

public class LambdaExpressions_and_AnonymousClasses {

    public static void main(String[] args) {

        // AnonymousClass ano = new AnonymousClass(); // Normal way
        // ano.display();
        // ano.fun1();
        // ano.fun2();

        // ? Anonymous Class
        DemoAno obj = new DemoAno() {

            @Override
            public void fun1() {
                System.out.println("I am fun1");
            }

            @Override
            public void fun2() {
                System.out.println("I am fun2");
            }
        };
        obj.fun1();
        obj.fun2();

        // ? Lambda Expressions

        // No parameters
        DemoAno2 obj2 = () -> { // Only for single method interfaces (functional interfaces)
            System.out.println("I am fun1");
        };
        obj2.fun1();

        // With parameters
        DemoAno3 obj3 = (a) -> {
            System.out.println("I am fun1, a = " + a);
        };
        obj3.fun1(5);
    }
}

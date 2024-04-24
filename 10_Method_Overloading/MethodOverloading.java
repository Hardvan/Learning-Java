// ? Method Overloading
// * Two or more methods having same name but different parameters - Overloaded Methods
// * Example of Compile Time (Static) Polymorphism

public class MethodOverloading {

    static void fun() {
        System.out.println("=== Inside fun() ===");
        System.out.println("Hello, World");
    }

    static void fun(int a) {
        System.out.println("=== Inside fun(int) ===");
        System.out.println("Number: " + a);
    }

    static int fun(int a, int b) {
        System.out.println("=== Inside fun(int, int) ===");
        return a + b;
    }

    public static void main(String[] args) {

        fun();
        fun(10);
        System.out.println("Sum: " + fun(10, 20));

        // Arguments: actual
        // Parameters: formal
    }
}

public class Methods {

    // ? DRY: Don't Repeat Yourself

    // ? Static keyword
    // * Associate a method with the class itself rather than the object.
    // * Static method in a class is shared by all objects of that class

    // ? We can call only static methods from another static method (like main)
    static int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        // Static method invocation
        int a = 1;
        int b = 2;
        int sum = add(a, b); // Pass by value
        System.out.println("Sum of " + a + " and " + b + " is " + sum);

        // Arrays and Objects are passed by reference

        // ? Method invocation using Object creation (Non-static method)
        Methods obj = new Methods();
        int diff = obj.sub(a, b);
        System.out.println("Difference of " + a + " and " + b + " is " + diff);

    }
}

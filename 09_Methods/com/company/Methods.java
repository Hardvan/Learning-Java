package com.company;

public class Methods {

    // ? DRY: Don't Repeat Yourself

    // ? Static keyword
    // * Associate a method/variable with the class itself rather than the object.
    // * Static method/variable in a class is shared by all objects of that class
    // * Called by class name, not by object reference

    // ? We can call only static methods from another static method (like main)
    // Reason: Static methods belong to the class, and they can be called without creating an instance of the class. Non-static methods require an instance of the class to be invoked, and since static methods do not have access to instance variables or methods, they cannot directly call non-static methods.
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

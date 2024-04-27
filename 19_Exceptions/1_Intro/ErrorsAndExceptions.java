// ? Exception
// * An event that occurs during the execution of a program that disrupts the normal flow of instructions.

// * Two types:
// ? 1) Checked Exceptions
// * Exceptions that are checked by the compiler at compile time.
// Eg: IOException, SQLException, ClassNotFoundException

// ? 2) Unchecked Exceptions (Runtime Exceptions)
// * Exceptions that are not checked by the compiler at compile time.
// Eg: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException

public class ErrorsAndExceptions {
    public static void main(String[] args) {

        // ? 1) Syntax Errors
        // int a = 10 // Missing semicolon
        // c = 10; // Variable c is not defined

        // ? 2) Logical Errors

        // ? 3) Runtime Errors (Exceptions)
        int a = 10 / 0; // ArithmeticException: / by zero
    }
}

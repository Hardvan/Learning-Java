// ? Java Documentation
// * JavaDoc is a tool that generates documentation in HTML format from Java source code.

/**
 * This class is used to demonstrate hello world program in java.
 * 
 * @author Hardvan (Hardik)
 * @version 1.0
 * @since 2023
 * @see Java Docs
 */
public class MyJavaDoc {

    /**
     * This method is used to add two numbers.
     * 
     * @param a
     * @param b
     * @return int
     * @throws ArithmeticException
     * @deprecated This method is deprecated. Use + operator instead.
     */
    @Deprecated
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

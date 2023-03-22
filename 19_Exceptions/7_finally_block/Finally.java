
public class Finally {
    public static void main(String[] args) {

        try {
            int c = 10 / 0;

        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);

        } finally { // This block will always execute even if there is no exception
            System.out.println("Finally block executed");

            // finally block is used to
            // 1. Close resources
            // 2. Close connections
        }
    }
}

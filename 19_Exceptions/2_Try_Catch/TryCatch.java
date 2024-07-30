public class TryCatch {
    public static void main(String[] args) {
        int a = 12345;
        int b = 0;
        int c;
        try {
            c = a / b; // Division by zero
            System.out.println(c);

        } catch (Exception e) {
            System.out.println("Division error! Reason:");
            System.out.println(e);
        }

        System.out.println("End of program");
    }
}

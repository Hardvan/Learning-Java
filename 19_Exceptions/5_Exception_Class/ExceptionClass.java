
class MyException extends Exception {

    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

public class ExceptionClass {
    public static void main(String[] args) {

        int a = 10;

        if (a < 100) {
            try {
                throw new MyException(); // ? throw keyword
                // throw new ArithmeticException();

            } catch (MyException e) {
                System.out.println(e); // calls e.toString()
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }

    }
}

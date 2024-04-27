class NegativeRadiusException extends Exception {

    @Override
    public String toString() {
        return "Radius cannot be negative.";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative.";
    }
}

public class ThrowVSThrows {

    // ? throws keyword
    // Indicates that the method may throw an exception
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static double area(double radius) throws NegativeRadiusException {
        if (radius < 0)
            throw new NegativeRadiusException(); // ? throw keyword

        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        try {
            int c = divide(10, 0);
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught.");
        }

        try {
            double d = area(-10);
            System.out.println(d);
        } catch (NegativeRadiusException e) {
            System.out.println(e.getMessage());
        }
    }
}

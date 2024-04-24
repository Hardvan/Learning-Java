public class VarArgs {

    // ? VarArgs - Variable Arguments
    // * 0 or more arguments
    // * VarArgs must be the last argument
    static int sum(int... arr) {
        System.out.println("=== Inside sum() ===");
        int result = 0;
        for (int i : arr)
            result += i;
        return result;
    }

    // Atleast one argument is required
    static void fun(int x, int... arr) {
        return;
    }

    public static void main(String[] args) {

        int result = sum(1, 2, 3, 4, 5);
        System.out.println("Sum: " + result);

        // sum(); // Sum: 0
    }
}

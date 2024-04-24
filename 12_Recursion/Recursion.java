public class Recursion {

    static int fact(int n) {
        // Base Case
        if (n <= 1)
            return 1;

        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.printf("%d! = %d", x, fact(x));
    }
}

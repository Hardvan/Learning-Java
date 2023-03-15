import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Getting user input...");

        // Creating a scanner object
        Scanner sc = new Scanner(System.in);

        // Getting user input
        System.out.println("Enter a number: ");

        // Checking if the input is an integer
        boolean isInt = sc.hasNextInt();
        System.out.println(isInt);

        // Getting the input
        if (isInt) {
            int number = sc.nextInt();
            System.out.println("You entered: " + number);
        } else {
            System.out.println("Invalid input");
        }

        // Getting a string
        System.out.println("Enter a string: ");
        String str = sc.next();

        System.out.println("You entered: " + str);

        // Closing the scanner
        sc.close();

    }
}

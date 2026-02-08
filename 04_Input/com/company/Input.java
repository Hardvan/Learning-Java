package com.company;

import java.util.Scanner;

public class Input {

    private static final String YOU_ENTERED = "You entered: ";

    public static void main(String[] args) {
        System.out.println("Getting user input...");

        // ? Creating a scanner object
        Scanner sc = new Scanner(System.in);

        // ? Getting user input

        // Getting an integer
        System.out.println("=== Reading an integer ===");
        System.out.print("Enter a number: ");
        boolean isInt = sc.hasNextInt(); // Checking if the input is an integer
        System.out.println("Is the input an integer: " + isInt);
        if (isInt) {
            int number = sc.nextInt();
            System.out.println(YOU_ENTERED + number);
        } else {
            System.out.println("Invalid input");
        }

        // Getting a string
        System.out.println("\n=== Reading a string ===");
        System.out.print("Enter a string (single word): ");
        String str = sc.next(); // Reads only one word
        System.out.println(YOU_ENTERED + str);

        sc.nextLine();  // Consume \n from previous input

        // Getting a line
        System.out.println("\n=== Reading a line ===");
        System.out.print("Enter a line: ");
        String line = sc.nextLine(); // Reads the whole line
        System.out.println(YOU_ENTERED + line);

        // ? Closing the scanner
        sc.close();
    }
}

/*
    ? System.out
    * System.out.print() - No new line
    * System.out.println() - New line
    * System.out.printf() - Format specifier // Good if prior knowledge of formatting (in C) is there
    %d - Integer
    %f - Float
    %s - String
    %c - Character
*/

public class Strings {
    public static void main(String[] args) {

        String a = "Hardvan";
        String b = new String("Hardvan");
        /*
         * Difference between a and b
         * a is a reference variable
         * b is a object variable
         */

        // ? String Methods
        // Strings are immutable
        String str = "Hardvan";
        System.out.println(str);

        // * Length
        int length = str.length();
        System.out.printf("Length: %d%n", length); // %n is a new line

        // * Lowercase
        String lower = str.toLowerCase();
        System.out.printf("Lowercase: %s%n", lower);

        // * Uppercase
        String upper = str.toUpperCase();
        System.out.printf("Uppercase: %s%n", upper);

        // * Trim (Removes spaces from both sides)
        String trim = " Hardvan ".trim();
        System.out.printf("Trim: %s%n", trim);

        // * Substring
        // Returns a substring from the given index to the end
        String sub1 = str.substring(2);
        String sub2 = str.substring(2, 4);
        System.out.printf("Substring: %s%n", sub1);
        System.out.printf("Substring: %s%n", sub2);

        // * Replace
        String rep = str.replace('a', 'e');
        System.out.printf("Replace: %s%n", rep);

        String rep2 = str.replace("van", "ik");
        System.out.printf("Replace: %s%n", rep2);

        // * startsWith
        boolean starts = str.startsWith("Ha");
        System.out.printf("Starts with: %b%n", starts);

        // * endsWith
        boolean ends = str.endsWith("van");
        System.out.printf("Ends with: %b%n", ends);

    }
}

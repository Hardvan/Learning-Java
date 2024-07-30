public class Strings {
    /*
    ? System.out
    * System.out.print()    - No new line
    * System.out.println()  - New line
    * System.out.printf()   - Format specifier // Good if prior knowledge of formatting (in C) is there
    %d - Integer
    %f - Float
    %s - String
    %c - Character
    */

    public static void main(String[] args) {

        String a = "Hardvan";
        String b = new String("Hardvan");
        /*
         * Difference between a & b:
         * a -> reference variable
         * b -> object variable
         */

        // ? String Methods
        // Strings are immutable
        String s = "Hardvan";
        System.out.println("String: " + s);

        // * .length()
        int length = s.length();
        System.out.printf("Length: %d%n", length); // %n is a new line

        // * .toLowerCase()
        String lower = s.toLowerCase();
        System.out.printf("Lowercase: %s%n", lower);

        // * .toUpperCase()
        String upper = s.toUpperCase();
        System.out.printf("Uppercase: %s%n", upper);

        // * .trim() (Removes spaces from both sides)
        String trim = " Hardvan ".trim();
        System.out.printf("Trim: %s%n", trim);

        // * .substring()
        // Returns a substring from [start, end)
        String sub1 = s.substring(2);
        String sub2 = s.substring(2, 4);
        System.out.printf("Substring: %s%n", sub1);
        System.out.printf("Substring: %s%n", sub2);

        // * .replace()
        String rep = s.replace('a', 'e');
        System.out.printf("Replace: %s%n", rep);
        String rep2 = s.replace("van", "ik");
        System.out.printf("Replace: %s%n", rep2);

        // * .startsWith()
        boolean starts = s.startsWith("Ha");
        System.out.printf("Starts with: %b%n", starts);

        // * .endsWith()
        boolean ends = s.endsWith("van");
        System.out.printf("Ends with: %b%n", ends);

        // * .charAt()
        char ch = s.charAt(2);
        System.out.printf("Char at: %c%n", ch);

        // * .indexOf()
        int index = s.indexOf("van");
        System.out.printf("Index of: %d%n", index);

        // * .lastIndexOf()
        // Returns the last index of the given character/string
        int lastIndex = s.lastIndexOf("a");
        System.out.printf("Last index of: %d%n", lastIndex);

        // * .equals()
        boolean eq = s.equals("Hardvan");
        System.out.printf("Equals: %b%n", eq);

        // * .equalsIgnoreCase()
        boolean eqI = s.equalsIgnoreCase("hardvan");
        System.out.printf("Equals ignore case: %b%n", eqI);
    }
}

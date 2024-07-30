public class SwitchCase {
    public static void main(String[] args) {
        // ? We can use switch case with Strings in Java
        String str = "Hardvan";
        switch (str) {
            case "Hardvan":
                System.out.println("Hello Hardvan");
                break;
            case "Hardik":
                System.out.println("Hello Hardik");
                break;
            default:
                System.out.println("Hello World");
        }
    }
}

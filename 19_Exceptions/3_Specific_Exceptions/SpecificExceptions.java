import java.util.Scanner;

public class SpecificExceptions {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        Scanner sc = new Scanner(System.in);

        // Getting index & number from user
        System.out.println("Enter an index: ");
        int index = sc.nextInt();
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        try {
            System.out.println("The value at array index " + index + " is " + arr[index]);
            arr[index] = num;
            System.out.println("The value at array index " + index + " is now " + arr[index]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred.");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred.");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Some exception occurred.");
            System.out.println(e);
        }

        sc.close();
    }
}

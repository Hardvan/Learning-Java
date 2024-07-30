import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        float marks1, marks2, marks3, marks4, marks5;
        float total, percentage;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects: ");
        marks1 = sc.nextFloat();
        marks2 = sc.nextFloat();
        marks3 = sc.nextFloat();
        marks4 = sc.nextFloat();
        marks5 = sc.nextFloat();

        total = marks1 + marks2 + marks3 + marks4 + marks5;
        percentage = (total / 500) * 100;
        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}

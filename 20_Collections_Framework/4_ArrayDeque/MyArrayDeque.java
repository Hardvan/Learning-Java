import java.util.ArrayDeque;

// ? ArrayDeque
// * Resizable array
// * Insertion & Deletion at both ends

public class MyArrayDeque {
    public static void main(String[] args) {
        // ? ArrayDeque
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        System.out.println("=== add() and addFirst() ===");
        ad.add(10);
        ad.addFirst(5);
        System.out.println(ad); // [5, 10]

        // * .getFirst() and .getLast()
        System.out.println("=== getFirst() and getLast() ===");
        System.out.println("First element: " + ad.getFirst()); // "First element: 5"
        System.out.println("Last element: " + ad.getLast()); // "Last element: 10"

        // * .removeFirst() and .removeLast()
        System.out.println("=== removeFirst() and removeLast() ===");
        ad.removeFirst();
        ad.removeLast();
        System.out.println(ad); // []
    }
}

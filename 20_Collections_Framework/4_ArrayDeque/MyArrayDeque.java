import java.util.ArrayDeque;

// ? ArrayDeque
// * Resizable array
// * Insertion & Deletion at both ends

public class MyArrayDeque {
    public static void main(String[] args) {

        // ? ArrayDeque
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();

        ad1.add(10);
        ad1.addFirst(5);

        System.out.println(ad1); // [5, 10]

        // * .getFirst() and .getLast()
        System.out.println(ad1.getFirst()); // 5
        System.out.println(ad1.getLast()); // 10

        // * .removeFirst() and .removeLast()
        ad1.removeFirst();
        ad1.removeLast();

        System.out.println(ad1); // []

    }
}

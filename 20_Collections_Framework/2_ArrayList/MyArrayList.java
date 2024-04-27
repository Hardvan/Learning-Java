import java.util.ArrayList;

public class MyArrayList {

    public static void display(ArrayList<Integer> lst) {
        for (int a : lst) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // ? ArrayList
        ArrayList<Integer> lst = new ArrayList<>();
        ArrayList<Integer> lst2 = new ArrayList<>(10); // Initial capacity

        // This is a generics class (like C++ templates)

        // ? Methods

        // * .add()
        System.out.println("=== add() ===");
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(2, 25);
        System.out.println("List 1:");
        display(lst); // 10 20 25 30

        lst2.add(100);
        lst2.add(200);
        System.out.println("List 2:");
        display(lst2); // 100 200

        // * .addAll()
        System.out.println("\n=== addAll() ===");
        lst.addAll(lst2); // Adds at the end
        System.out.println("List 1:");
        display(lst); // 10 20 25 30 100 200

        // * .size() and .get()
        System.out.println("\n=== size() and get() ===");
        for (int i = 0; i < lst.size(); i++) {
            System.out.print(lst.get(i) + " ");
        }
        System.out.println();

        // * clear()
        System.out.println("\n=== clear() ===");
        lst2.clear(); // Removes all elements
        System.out.println("List 2:");
        display(lst2); // Empty

        // * .contains()
        System.out.println("\n=== contains() ===");
        boolean isPresent = lst.contains(25); // true
        System.out.println("Is 25 present? " + isPresent); // "Is 25 present? true

        // * .indexOf()
        System.out.println("\n=== indexOf() ===");
        int index = lst.indexOf(25); // 2
        System.out.println("Index of 25: " + index); // "Index of 25: 2

        // * .isEmpty()
        System.out.println("\n=== isEmpty() ===");
        boolean isEmpty = lst.isEmpty(); // false
        System.out.println("Is lst empty? " + isEmpty); // "Is lst empty? false

        // * .remove()
        System.out.println("\n=== remove() ===");
        System.out.println("Removing element at index 2");
        lst.remove(2);
        System.out.println("List 1:");
        display(lst); // 10 20 30 100 200

        // * .set()
        System.out.println("\n=== set() ===");
        System.out.println("Replacing element at index 2 with 50");
        lst.set(2, 50);
        display(lst); // 10 20 50 30 100 200
    }
}

import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {

        // ? LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        // This is a generics class (like C++ templates)

        // ? Methods (Similar to ArrayList)

        // * .add()
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(2, 25);

        list2.add(100);
        list2.add(200);

        // * .addAll()
        list.addAll(list2); // Adds at the end

        System.out.println(list); // [10, 20, 25, 30, 100, 200]
        // OR
        // * .size() and .get()
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // * clear()
        list2.clear(); // Removes all elements

        // * .contains()
        boolean isPresent = list.contains(25); // true
        System.out.println(isPresent);

        // * .indexOf()
        int index = list.indexOf(25); // 2

        // * .isEmpty()
        boolean isEmpty = list.isEmpty(); // false

        // * .remove()
        list.remove(2); // Removes element at index 2

        // * .set()
        list.set(2, 50); // Replaces element at index 2 with 50

        // * .addLast()
        list.addLast(100); // Adds 100 at the end

    }
}

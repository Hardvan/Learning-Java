import java.util.HashSet;

// ? Hash Set
// * Load Factor: Ratio of the no. of elements in the hash table to the size of the hash table
// * It decides when to increase the size of the hash table

// ? Provides constant time performance for the basic operations (add, remove, contains and size)

public class MyHashSet {
    public static void main(String[] args) {
        // ? HashSet
        // Default initial capacity is 16
        // Default load factor is 0.75
        HashSet<Integer> hashSet = new HashSet<>(10, 0.5f);

        System.out.println("=== add() ===");
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        System.out.println(hashSet); // [1, 2, 3, 4, 5, 6]
    }
}

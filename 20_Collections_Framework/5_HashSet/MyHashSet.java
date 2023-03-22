import java.util.HashSet;

// ? Hash Set
// * Load Factor: Ratio of the number of elements in the hash table to the size of the hash table
// * It decided when to increase the size of the hash table

// ? Provides constant time performance for the basic operations (add, remove, contains and size)

public class MyHashSet {
    public static void main(String[] args) {

        // ? HashSet
        // Default initial capacity is 16
        // Default load factor is 0.75
        HashSet<Integer> hash_set = new HashSet<>(10, 0.5f);

        hash_set.add(1);
        hash_set.add(2);
        hash_set.add(3);
        hash_set.add(4);
        hash_set.add(5);
        hash_set.add(6);

        System.out.println(hash_set); // [1, 2, 3, 4, 5, 6]

    }
}

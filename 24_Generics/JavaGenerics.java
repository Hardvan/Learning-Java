import java.util.ArrayList;

// ? Java Generics
// * Used to specify the type of data that a class or a method can work with
// * Generic data types cannot be primitive types (int, char, etc.)
// * Generic data types can be any type of class (String, Integer, etc.)

// Generic class
class MyGeneric<T1, T2> {

    // Attributes
    int val = 123;
    private T1 t1; // Generic data type
    private T2 t2;

    // Constructor
    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    // val
    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    // t1
    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    // t2
    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}

public class JavaGenerics {
    public static void main(String[] args) {

        // If we do
        // * ArrayList list = new ArrayList();
        // then we can add any type of data in it
        // But getting the data from it will be a problem
        // * int a = list.get(0); // This will give an error
        // Because we don't know what type of data is stored in the list
        // * int a = (int) list.get(0); // We will have to typecast it
        // So we use Generics

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);

        System.out.println("Element at index 0: " + list.get(0));

        // Generic Class
        MyGeneric<String, Float> obj = new MyGeneric<>(123456789, "Hello", 1.23f);
        System.out.println("val: " + obj.getVal());
        System.out.println("t1: " + obj.getT1());
        System.out.println("t2: " + obj.getT2());
    }
}

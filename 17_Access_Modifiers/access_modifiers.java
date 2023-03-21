// ? Access Levels
// * Class

// * Package: Refers to classes in the same package
// (Here C1 and access_modifiers are in the same package)

// * Subclass: Refers to other packages that are subclasses of the class

// * World: Refers to all classes in the world

class C1 {

    public int x = 5;
    protected int y = 6;
    int z = 7; // default
    private int a = 8;

}

public class access_modifiers {
    public static void main(String[] args) {

        C1 c = new C1();

        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a); // error: a has private access in C1

    }

}

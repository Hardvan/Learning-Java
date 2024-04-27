// ? Interface
// * Group of related methods with empty bodies.

// ? Abstract class vs Interface
// * We can't EXTEND multiple abstract classes
// * But we can IMPLEMENT multiple interfaces.

// Subclass s = new Superclass(); allowed for both abstract class and interface

// Interface
interface Bicycle {

    int a = 10; // You can create properties in interface, but not modify them (final)
    // Variables are public, static, final by default in interface

    // Interface methods are public, abstract by default
    void applyBrake(int decrement);

    void speedUp(int increment);
}

interface Horn {
    void blowHorn();
}

// implements keyword
class Hero implements Bicycle, Horn {

    int speed = 0; // Initial speed
    int a = 20; // Modifying a is allowed in subclass

    @Override
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void blowHorn() {
        System.out.println("Pee Pee Poo Poo Dhaichuu!");
    }

    void printSpeed() {
        System.out.println("Speed: " + speed);
    }
}

public class Interfaces {
    public static void main(String[] args) {

        Hero h = new Hero();

        System.out.println("a: " + h.a);
        // h.a = 100; // Error because a is final

        h.speedUp(10);
        h.applyBrake(5);
        h.printSpeed();
        h.blowHorn();
    }
}

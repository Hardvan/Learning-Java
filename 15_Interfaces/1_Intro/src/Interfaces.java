// ? Interface
// * In English, point where two systems meet and interact.
// * In Java, group of related methods with empty bodies.

// ? Abstract class vs Interface
// * We can't extend multiple abstract classes
// * But we can implement multiple interfaces.

// ? Interface
interface Bicycle {
    void applyBrake(int decrement);

    void speedUp(int increment);
}

// ? implements keyword
class Hero implements Bicycle {

    int speed = 0; // Initial speed

    @Override
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    void printStates() {
        System.out.println("Speed: " + speed);
    }
}

public class Interfaces {
    public static void main(String[] args) {

        Hero h = new Hero();
        h.speedUp(10);
        h.applyBrake(5);
        h.printStates(); // Speed: 5

    }
}

class Phone {

    public void showTime() {
        System.out.println("Time is 10:00 AM");
    }

    public void on() {
        System.out.println(("Phone turning on..."));
    }
}

class SmartPhone extends Phone {

    public void music() {
        System.out.println("Playing music...");
    }

    @Override
    public void on() {
        System.out.println(("Smartphone turning on..."));
    }

}

public class DynamicMethodDispatch {
    public static void main(String[] args) {

        Phone obj = new SmartPhone(); // Allowed
        // SmartPhone obj2 = new Phone(); // Not Allowed

        // ? This is called Dynamic Method Dispatch
        // * At runtime, decision is taken which method to call
        // * Superclass reference variable can hold the reference of subclass object
        // It is like:
        // Every smartphone is a phone,
        // but not every phone is a smartphone
        // * Useful for runtime polymorphism

        // Superclass methods work
        obj.showTime(); // Hello!

        // Overridden methods work
        obj.on(); // Smartphone turning on...

        // Only subclass methods don't work
        // obj.music(); // Error (because music() is not in Phone class)
    }
}

// ? Annotations
// * Provide extra info about a program

// * Common Annotations:
// @Override --> To override a method
// @Deprecated --> To mark a method as deprecated
// @SuppressWarnings --> To suppress warnings from compiler
// @FunctionalInterface --> To mark an interface as functional interface (interface with only one abstract method)

class Phone {
    void showTime() {
        System.out.println("Time is 8 AM");
    }
}

class SmartPhone extends Phone {

    @Override
    void showTime() {
        System.out.println("Time is 8:20 AM");
    }

    @Deprecated
    void showConfig() {
        System.out.println("Config is 4GB RAM, 64GB ROM");
    }

}

@FunctionalInterface
interface MyFunctionalInterface {

    void sayHello();
    // void sayHi(); // This will give error

}

public class JavaAnnotations {
    @SuppressWarnings("deprecation") // To suppress warnings from compiler
    public static void main(String[] args) {

        SmartPhone sp = new SmartPhone();

        sp.showTime();
        sp.showConfig(); // This method is deprecated

    }
}

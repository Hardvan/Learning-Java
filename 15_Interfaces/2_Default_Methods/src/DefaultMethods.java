// ? Default Methods
// * Enable us to add new functionality to existing interfaces
// * Without breaking the existing code

interface Camera {

    void takeSnap();

    void recordVideo();

    // Private Method (Cannot be called from outside the interface)
    private void greet() { // Useful for code reusability in default methods
        System.out.println("Good Morning");
    }

    // ? Default Method
    default void record4KVideo() {
        greet();
        System.out.println("Recording in 4K...");
    }
}

interface WiFi {

    String[] getNetworks();

    void connectToNetwork(String network);
}

class CellPhone {

    void callNumber(int phoneNo) {
        System.out.println("Calling " + phoneNo);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class SmartPhone extends CellPhone implements Camera, WiFi {

    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Recording video");
    }

    // public void record4KVideo() {
    // System.out.println("Recording in 4K in smart phone...");
    // }

    public String[] getNetworks() {
        System.out.println("Getting list of networks");
        String[] networkList = { "ABC", "DEF", "GHI" };
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class DefaultMethods {
    public static void main(String[] args) {

        SmartPhone sp = new SmartPhone();

        String[] arr = sp.getNetworks();
        for (String item : arr)
            System.out.println(item);

        sp.record4KVideo();
        // sp.greet(); // Private method cannot be called from outside the interface

    }
}

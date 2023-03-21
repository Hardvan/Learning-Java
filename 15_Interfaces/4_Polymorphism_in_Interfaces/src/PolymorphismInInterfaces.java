
interface Camera {

    void takeSnap();

    void recordVideo();

    private void greet() {
        System.out.println("Good Morning");
    }

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

public class PolymorphismInInterfaces {
    public static void main(String[] args) {

        Camera cam1 = new SmartPhone(); // Can use Camera methods ONLY
        cam1.record4KVideo(); // Allowed
        // cam1.getNetworks(); // Not allowed

    }
}

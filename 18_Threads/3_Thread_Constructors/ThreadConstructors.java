class MyThread extends Thread {
    // Constructor
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

public class ThreadConstructors {
    public static void main(String[] args) {
        MyThread t = new MyThread("Hardvan");
        t.start();

        System.out.println("Thread ID: " + t.threadId());
        System.out.println("Thread Name: " + t.getName());
    }
}

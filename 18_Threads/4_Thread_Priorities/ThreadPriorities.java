
class MyThr extends Thread {

    // Constructor
    public MyThr(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(("Thread " + this.getName()));
        }
    }
}

public class ThreadPriorities {
    public static void main(String[] args) {

        // Ready Queue: A, B, C, D, E
        MyThr t1 = new MyThr("A (least important)");
        MyThr t2 = new MyThr("B");
        MyThr t3 = new MyThr("C");
        MyThr t4 = new MyThr("D");
        MyThr t5 = new MyThr("E (most important)");

        // Set priority
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // E (most important) is seen more often than the others

    }
}

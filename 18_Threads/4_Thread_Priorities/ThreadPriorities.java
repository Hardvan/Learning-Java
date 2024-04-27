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
        MyThr t3 = new MyThr("C (average priority)");
        MyThr t4 = new MyThr("D");
        MyThr t5 = new MyThr("E (most important)");

        // Set priority
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t3.setPriority(Thread.NORM_PRIORITY); // 5 (Default priority)
        t5.setPriority(Thread.MAX_PRIORITY); // 10

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // E (most important) is seen more often than the others
    }
}

class MyThr1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(i + ". Thread 1");
            // Sleep for 455 ms
            try {
                Thread.sleep(455); // ? .Thread.sleep()
                if (i == 10) {
                    throw new InterruptedException();
                }
            } catch (InterruptedException e) {
                System.out.println(e);
                break;
            }
            i++;
        }
    }
}

class MyThr2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread 2");
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1();
        MyThr2 t2 = new MyThr2();

        t1.start();
        try {
            t1.join(); // ? .join()
            // t1 will finish before t2 starts
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start(); // t2 will start after t1 finishes
    }
}

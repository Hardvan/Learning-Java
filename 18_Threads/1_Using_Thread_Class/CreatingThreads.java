// ? Creating Threads
// * Two ways:
// * 1) extend Thread class
// * 2) implement Runnable interface

class MyThread1 extends Thread {
    @Override
    public void run() { // run() is a method of Thread class
        while (true) {
            System.out.println("Thread1 is Running.");
            System.out.println("I am happy!");
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread2 is Running.");
            System.out.println("I am sad.");
        }
    }
}

public class CreatingThreads {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        // start() is a method of Thread class
        t1.start();
        t2.start();

        // main thread
        while (true) {
            System.out.println("Main Thread is Running.");
            System.out.println("I am busy!");
        }
    }
}

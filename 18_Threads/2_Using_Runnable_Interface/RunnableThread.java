
class MyThreadRunnable1 implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("Thread1 is running");
        }
    }
}

class MyThreadRunnable2 implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("Thread2 is running");
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {

        // Bullet & Gun Analogy:
        // Bullet(runnable) by itself cannot shoot
        // We need a gun(thread) to shoot the bullet(runnable)

        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
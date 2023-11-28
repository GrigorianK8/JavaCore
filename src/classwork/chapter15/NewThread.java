package classwork.chapter15;

public class NewThread implements Runnable {

    Thread t;

    NewThread() {
        t = new Thread(this, "Demonstration Stream.");
        System.out.println("Subsidiary stream created: " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Subsidiary stream:" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Subsidiary flow has been interrupted!");
        }
        System.out.println("The daughter stream is complete.");
    }
}
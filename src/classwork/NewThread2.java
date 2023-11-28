package classwork;

public class NewThread2 extends Thread {

    NewThread2() {
        super("Demonstration Stream");
        System.out.println("Subsidiary stream: " + this);
        start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Subsidiary Stream: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Subsidiary flow has been interrupted!");
        }
        System.out.println("The daughter stream is complete.");
    }
}
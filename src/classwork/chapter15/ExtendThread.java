package classwork.chapter15;

public class ExtendThread {

    public static void main(String[] args) {

        new NewThread();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("MainStream: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main flow has been interrupted!");
        }
        System.out.println("The main stream is complete.");
    }
}
package classwork.chapter15;

public class ThreadDemo {

    public static void main(String[] args) {

        new NewThread();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Mainstream: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("The main stream is complete.");
        }
    }
}
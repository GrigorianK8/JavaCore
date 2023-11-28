package classwork.chapter15;

public class CurrentThreadDemo {

    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        System.out.println("Current flow of execution: " + t);

        t.setName("My Thread");
        System.out.println("After changing the name of the stream: " + t);

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("The main stream of execution has been interrupted!");
        }
    }
}
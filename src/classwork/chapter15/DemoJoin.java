package classwork.chapter15;

public class DemoJoin {

    public static void main(String[] args) {

        NewThread3 ob = new NewThread3("One");
        NewThread3 ob2 = new NewThread3("Two");
        NewThread3 ob3 = new NewThread3("Three");

        System.out.println("Stream One is up and running: " + ob.t.isAlive());
        System.out.println("Stream One is up and running: " + ob2.t.isAlive());
        System.out.println("Stream One is up and running: " + ob3.t.isAlive());

        try {
            System.out.println("Waiting for threads to complete.");
            ob.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("The main stream interrupted!");
        }

        System.out.println("Stream One is up and running: " + ob.t.isAlive());
        System.out.println("Stream One is up and running: " + ob2.t.isAlive());
        System.out.println("Stream One is up and running: " + ob3.t.isAlive());
        System.out.println("The main stream is complete!");
    }
}
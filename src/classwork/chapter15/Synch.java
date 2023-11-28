package classwork.chapter15;

public class Synch {

    public static void main(String[] args) {

        CallMe target = new CallMe();
        Caller ob3 = new Caller(target, "Welcome");
        Caller ob2 = new Caller(target, "in synchronized");
        Caller ob = new Caller(target, "world!");

        try {
            ob.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
        }
    }
}
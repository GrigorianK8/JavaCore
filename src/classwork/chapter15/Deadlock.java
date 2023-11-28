package classwork.chapter15;
import classwork.B;

public class Deadlock implements Runnable {

    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("MainStream");
        Thread t = new Thread(this, "A rival stream.");

        a.foo(b);
        System.out.println("Back to the main stream.");
    }

    public void run() {
        b.bar(a);
        System.out.println("Back to the main stream.");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
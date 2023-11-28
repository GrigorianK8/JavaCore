package classwork.chapter15;
import classwork.B;

public class A {

    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered into method A.foo()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("class A interrupted!");
        }
        System.out.println(name + "tries to call the B.last() method");
        b.last();
    }

    public synchronized void last() {
        System.out.println("in A.last() method");
    }
}
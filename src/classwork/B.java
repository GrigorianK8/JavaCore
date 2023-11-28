package classwork;

import classwork.chapter15.A;

public class B {

    public synchronized void bar(A a) {
        String name = Thread.currentThread().getName();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("class B interrupted!");
        }
        System.out.println(name + "tries to call the A.last() method");
        a.last();
    }

    public synchronized void last() {
        System.out.println("in A.last() method");
    }
}
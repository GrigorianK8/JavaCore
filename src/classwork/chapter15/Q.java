package classwork.chapter15;

public class Q {

    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception type " + "InterruptedException intercepted");
            }
        }
        System.out.println("Received: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception type " + "InterruptedException intercepted");
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Sent: " + n);
        notify();
    }
}
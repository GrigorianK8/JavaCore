package classwork.chapter15;

import classwork.chapter12.C;

public class PCFixed {

    public static void main(String[] args) {

        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("To stop, press Ctrl+C.");
    }
}
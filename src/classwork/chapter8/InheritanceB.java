package classwork.chapter8;

public class InheritanceB extends InheritanceA {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i + j + k: " + (i + j + k));
    }

    InheritanceB() {
        System.out.println("B in constructor B.");
    }
}
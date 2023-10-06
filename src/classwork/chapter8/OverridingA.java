package classwork.chapter8;

public class OverridingA {
    int i, j;

    OverridingA(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}
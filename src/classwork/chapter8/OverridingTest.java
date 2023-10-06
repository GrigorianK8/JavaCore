package classwork.chapter8;

public class OverridingTest {

    public static void main(String[] args) {
        OverridingB subOb = new OverridingB(1, 2, 3);

        subOb.show("This is a K: ");
        subOb.show();
    }
}
package classwork.chapter7;

public class PassObTest {
    int a, b;

    PassObTest(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(PassObTest o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }
}
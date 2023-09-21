package classwork.chapter7;

public class CallValueTest {
    int a, b;

    CallValueTest(int i, int j) {
        a = i;
        b = j;
    }

    void meth(CallValueTest o) {
        o.a *= 2;
        o.b /= 2;
    }

//    void meth(int i, int j) {
//        i *= 2;
//        j /= 2;
// }
}
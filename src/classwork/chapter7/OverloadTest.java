package classwork.chapter7;

public class OverloadTest {
    void test() {
        System.out.println("There are no parameters");
    }

/*    void test(int a) {
        System.out.println("a: " + a);
    } */

    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    /*    double test(double a) {
            System.out.println("a: " + a);
            return a * a;
        } */
    void test(double a) {
        System.out.println("internal conversion when calling "
                + "test()double a: " + a);
    }
}
package classwork.chapter7;

public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("conclusion: outer_x = " + outer_x);
        }
    }

//    void showy() {               error, variable y is not
//        System.out.println(y);    available her
//    }
}
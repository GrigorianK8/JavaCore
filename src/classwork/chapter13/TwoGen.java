package classwork.chapter13;

public class TwoGen<T, V> {

    T ob;
    V ob2;

    TwoGen(T o, V o2) {
        ob = o;
        ob2 = o2;
    }

    void showTypes() {
        System.out.println("Type T: " + ob.getClass().getName());
        System.out.println("Type V: " + ob2.getClass().getName());
    }

    T getOb() {
        return ob;
    }

    V getOb2() {
        return ob2;
    }
}
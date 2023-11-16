package classwork.chapter13;

public class Gen<T> extends NonGen2 {

    T ob;

    Gen(T o, int i) {
        super(i);
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showTipe() {
        System.out.println("Type T is " + ob.getClass().getName());
    }
}
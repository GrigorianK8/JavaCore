package classwork.chapter13;

public class NonGen {

    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Object ob belongs to the type " + ob.getClass().getName());
    }


}
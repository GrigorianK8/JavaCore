package classwork.chapter8;

public class DispatchTest {

    public static void main(String[] args) {
        DynamicDispatchA dispatchA = new DynamicDispatchA();
        DynamicDispatchB dispatchB = new DynamicDispatchB();
        DynamicDispatchC dispatchC = new DynamicDispatchC();

        DynamicDispatchA r;

        r = dispatchA;
        r.callMe();

        r = dispatchB;
        r.callMe();

        r = dispatchC;
        r.callMe();
    }
}
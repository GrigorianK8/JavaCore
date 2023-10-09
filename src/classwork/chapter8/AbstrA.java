package classwork.chapter8;

abstract class AbstrA {
    abstract void callMe();

    void callMeToo() {
        System.out.println("This is a specific method.");
    }
}
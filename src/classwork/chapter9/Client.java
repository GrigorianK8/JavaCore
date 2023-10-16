package classwork.chapter9;

public class Client implements Callback {

    @Override
    public void callback(int p) {
        System.out.println("Method Callback(), " +
                "callable with value " + p);
    }

    void nonIfaceMeth() {
        System.out.println("In classes that implement interfaces, "
        + "other members may be defined");
    }
}
package classwork.chapter9;

public class AnotherClient implements Callback {

    @Override
    public void callback(int p) {
        System.out.println("Another variant of the callback method()");
        System.out.println("p squared is " + (p * p));
    }
}
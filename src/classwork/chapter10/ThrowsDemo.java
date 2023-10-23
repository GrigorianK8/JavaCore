package classwork.chapter10;

public class ThrowsDemo {

    static void throwOne() throws IllegalAccessException {
        System.out.println("In body of the throwOne() method.");
        throw new IllegalAccessException("Demonstration.");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Exception intercepted: " + e);
        }
    }
}
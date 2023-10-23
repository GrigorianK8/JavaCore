package classwork.chapter10;

public class Exc2 {

    public static void main(String[] args) {
        int d, a;

        try {
            d = 0;
            a = 42 / d;
            System.out.println("This will not be deduced.");
        } catch (ArithmeticException e) {
            System.out.println("Dividing by zero.");
        }
        System.out.println("After the catch statement.");
    }
}
package classwork.chapter10;

public class MultyCatch {

    public static void main(String[] args) {
        int a = 10, b = 0;
        int[] vals = {1, 2, 3};

        try {
            int rezult = a / b;
            vals[10] = 19;
        } catch (ArithmeticException |
                 ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception intercepted: " + e);
        }
        System.out.println("After multiple interceptions.");
    }
}
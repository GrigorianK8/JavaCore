package classwork.chapter10;

import java.util.Random;

public class HandleError {

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random r = new Random();

        for (int i = 0; i < 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Exception " + e);
                //    System.out.println("Dividing by zero.");
                a = 0; // assign zero and continue working
            }
            System.out.println("a: " + a);
        }
    }
}
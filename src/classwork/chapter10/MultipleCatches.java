package classwork.chapter10;

public class MultipleCatches {

    public static void main(String[] args) {

        try {
            int a = args.length;
            System.out.println("a: " + a);
            int b = 42 / a;
            int[] c = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Dividing by zero: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indexing error outside of " +
                    "array: " + e);
        }
        System.out.println("After the try/catch statement block.");
    }
}
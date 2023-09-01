package homeworks;

public class ForExamples {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            System.out.print("-" + i);
        }

        System.out.println("\n");

        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        int[] array = {2, 5, 8, 4, 9, 3, 7};
        int largdig = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largdig) {
                largdig = array[i];
            }
        }
        System.out.println("The largest digit in the array: " + largdig);
    }
}
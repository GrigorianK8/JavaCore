package homeworks;

public class Sort {
    public static void main(String[] args) {
        int[] array = {4, 7, 1, 3, 9, 0, 2};
        int t;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;
                    sorted = false;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
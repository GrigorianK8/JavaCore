package homeworks;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] numbers = {1, 6, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println(numbers[0]);
        System.out.println(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int minValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (minValue > numbers[i]) {
                minValue = numbers[i];
                System.out.println(minValue);
            }
        }
        int middleIndex = numbers.length / 2;
        if (numbers.length / 2 == 1) {
            System.out.println("Middle of the array " + middleIndex);
        } else {
            System.out.println("Middle of the array " + numbers[middleIndex - 1] + ", " + numbers[middleIndex]);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                System.out.print(numbers[i] + " ");
            }
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        double mean = 0;
        for (int i = 0; i < numbers.length; i++) {
            mean += numbers[i];
        }
        System.out.println(mean / numbers.length);
    }
}
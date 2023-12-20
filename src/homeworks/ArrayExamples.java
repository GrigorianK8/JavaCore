package homeworks;

public class ArrayExamples {

    public static void main(String[] args) {

        int[] numbers = {5, 4, 8, 6, 9, 1, 3, 7, 2};

        System.out.print("Array index: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Originally array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.print("Revers array: ");
        int length = numbers.length;
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[length - i - 1];
            numbers[length - i - 1] = temp;
        }
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Sorted array: ");
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        int minValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        System.out.println("Smallest value: " + minValue);

        int maxValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        System.out.println("Biggest value: " + maxValue);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);

        double mean = (double) sum / numbers.length;
        System.out.println("Mean: " + mean);

        int midlIndex = numbers.length / 2;
        if (numbers.length % 2 == 1) {
            System.out.println("Midl index: " + numbers[midlIndex]);
        } else {
            System.out.println("Midl Index: " + numbers[midlIndex - 1] + ", " + numbers[midlIndex]);
        }

        System.out.print("Even values: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Odd values: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
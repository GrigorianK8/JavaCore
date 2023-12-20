package homeworks;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] numbers = {1, 6, 9, 15, 52, -3, 5, 8};

        // Print the array elements
        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Print the first and last elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        // Print the indices of the array
        System.out.print("Indexes: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Find the smallest value in the array
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (minValue > numbers[i]) {
                minValue = numbers[i];
            }
        }
        System.out.println("Smallest value in the array: " + minValue);

        // Find the middle of the array
        int middleIndex = numbers.length / 2;
        if (numbers.length % 2 == 1) {
            System.out.println("Middle of the array: " + numbers[middleIndex]);
        } else {
            System.out.println("Middle of the array: " + numbers[middleIndex - 1] + ", " + numbers[middleIndex]);
        }

        // Print even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();

        // Print odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();

        // Calculate and print the sum of the array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);

        // Calculate and print the mean of the array elements
        double mean = (double) sum / numbers.length;
        System.out.println("Mean: " + mean);
    }
}
package homeworks;

public class StringExample {

    public static void stringRevers(String string) {
        char[] charArray = string.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i] + " ");
        }
    }

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        stringRevers(inputString);
    }
}

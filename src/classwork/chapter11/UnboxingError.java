package classwork.chapter11;

public class UnboxingError {

    public static void main(String[] args) {

        Integer iOb = 100;
        int i = iOb.byteValue();

        System.out.println(i);
    }
}